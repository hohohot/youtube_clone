<template>
    <div
        class="gstl_50 sbdd_a"
        dir="ltr"
        style="min-width: 616px; top: 47px; position: fixed; text-align: left; ">
        <div class="fl"></div>
        <div>
            <div class="sbdd_b">
                <div class="sbsb_a">
                    <ul class="sbsb_b" role="listbox">
                        <KeywordItem v-for="(item, index) in recomdendList" :key="index" :keyword="item"/>
                    </ul>
                </div>
            </div>
            <div></div>
        </div>
    </div>
</template>

<script>
import KeywordItem from './KeywordItem.vue'

export default{
    components:{
        KeywordItem:KeywordItem
    },
    props:['recomdendList'],
}
</script>
