// src/main/resources/static/js/auth.js

// Intercepta todas as requisições fetch para adicionar o token JWT
(function() {
    const originalFetch = window.fetch;

    window.fetch = async function(...args) {
        let [resource, options] = args;

        // Verifica se a URL é para o nosso backend (evita enviar token para APIs externas)
        // Ajuste esta condição conforme necessário para suas URLs de backend
        const isInternalApi = resource.startsWith('/') && !resource.startsWith('//'); // Exemplo: /api/produtos, /cliente/novo

        if (isInternalApi) {
            const token = localStorage.getItem('jwtToken');
            if (token) {
                options = options || {};
                options.headers = {
                    ...options.headers,
                    'Authorization': `Bearer ${token}`
                };
            }
        }
        return originalFetch(resource, options);
    };
})();

// Opcional: Interceptar XMLHttpRequest também, se você tiver código legado usando-o
(function() {
    const originalOpen = XMLHttpRequest.prototype.open;

    XMLHttpRequest.prototype.open = function(method, url, async, user, password) {
        this.addEventListener('readystatechange', function() {
            if (this.readyState === 4 && this.status === 401) {
                // Opcional: Redirecionar para a página de login se o token expirar ou for inválido
                // window.location.href = '/login';
            }
        }, false);

        // Verifica se a URL é para o nosso backend
        const isInternalApi = url.startsWith('/') && !url.startsWith('//');

        if (isInternalApi) {
            const token = localStorage.getItem('jwtToken');
            if (token) {
                this.setRequestHeader('Authorization', `Bearer ${token}`);
            }
        }
        originalOpen.apply(this, arguments);
    };
})();
