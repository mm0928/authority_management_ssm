<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<link rel="stylesheet" href="/editormd/examples/css/style.css" />
<link rel="stylesheet" href="/editormd/css/editormd.css" />

<script src="/editormd/examples/js/jquery.min.js"></script>
<script src="/editormd/editormd.js"></script>

<div class=" editormd"  id="test-editormd">
        <textarea class="editormd-markdown-textarea" name="test-editormd-markdown-doc">
         </textarea>
    <!-- 第二个隐藏文本域，用来构造生成的HTML代码，方便表单POST提交，这里的name可以任意取，后
        台接受时以这个name键为准 -->
    <textarea class="editormd-html-textarea" name="editorhtml" id="editorhtml">
        </textarea>
</div>

