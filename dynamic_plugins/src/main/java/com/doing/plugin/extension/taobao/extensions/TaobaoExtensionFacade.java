package com.doing.plugin.extension.taobao.extensions;

import com.doing.plugin.BizCode;
import com.doing.plugin.extension.ExtensionFacade;
import com.doing.plugin.extension.ModifyExtension1;
import com.doing.plugin.extension.ModifyExtension2;

/**
 * @author Doing on 19/12/2018 19:44
 */
@BizCode("taobao")
public class TaobaoExtensionFacade implements ExtensionFacade {

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new TaobaoModifyExtension1();
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new TaobaoModifyExtension2();
    }
}
