<template>
    <li
        @mouseover="setActivate"
        @mouseleave="setDeactivate"
        @mousedown="clickListener"
        role="presentation"
        :class="classState"
        dir="ltr"
        style="text-align: left;">
        <div class="sbse" id="sbse4" role="option">
            <div class="sbqs_a"></div>
            <div class="sbqs_c">{{this.keyword}}
            </div>
        </div>
    </li>
</template>

<script>
    export default {
        methods: {
            setActivate() {
                this.classState = "sbsb_c gsfs sbsb_d"
            },
            setDeactivate() {
                this.classState = "sbsb_c gsfs"
            },
            clickListener(){
                location.href=`/?search=${this.keyword}`;
            }
        },
        data() {
            return {classState: "sbsb_c gsfs"}
        },
        props: ['keyword']
    }
</script>