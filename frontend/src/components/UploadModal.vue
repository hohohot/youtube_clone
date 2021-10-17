<template>
    <div class="container">
        <form action="/postvideo" method="post" enctype="multipart/form-data">
            <div class="form-group row">
                <label for="inputTitle" class="col-sm-2 col-form-label">
                    <strong>제목</strong>
                </label>
                <div class="col-sm-10">
                    <input type="text" name="title" class="form-control" id="inputTitle"/></div>
            </div>
            <div class="form-group row">
                <label for="inputContent" class="col-sm-2 col-form-label">
                    <strong>설명</strong>
                </label>
                <div class="col-sm-10">
                    <textarea type="text" name="description" class="form-control" id="inputContent"></textarea>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFile" class="col-sm-2 col-form-label">
                    <strong>비디오</strong>
                </label>
                <div class="col-sm-10">
                    <div class="custom-file" id="inputFile">
                        <input name="video" type="file" class="custom-file-input" id="customFile"/>
                        <label class="custom-file-label" for="customFile">파일을 선택해 주세요.</label>
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputFile" class="col-sm-2 col-form-label">
                    <strong>섬네일</strong>
                </label>
                <div class="col-sm-10">
                    <div class="custom-file" id="inputFile">
                        <input name="thumbnail" type="file" class="custom-file-input" id="customFile"/>
                        <label class="custom-file-label" for="customFile">파일을 선택해 주세요.</label>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-auto mr-auto"></div>
                <div class="col-auto">
                    <input class="btn btn-primary" type="submit" role="button" value="글쓰기"/></div>
            </div>
        </form>
    </div>
</template>