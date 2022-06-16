function getQueryVal(field) {
    const fields = location.search.substring(1).split("&");
    for (const value of fields) {
        const pair = value.split("=");
        if (pair[0] === field) return pair[1];
    }
    return null;
}
