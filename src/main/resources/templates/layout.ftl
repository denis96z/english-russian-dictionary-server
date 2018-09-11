<#macro page_title></#macro>
<#macro page_content></#macro>

<#macro page_layout>
    <!doctype html>
    <html>
        <head>
            <title><@page_title/></title>
            <link rel="stylesheet" href="/css/layout.css">
        </head>
        <body>
            <@page_content/>
        </body>
    </html>
</#macro>
