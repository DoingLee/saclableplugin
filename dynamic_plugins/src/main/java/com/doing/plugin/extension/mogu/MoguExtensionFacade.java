package com.doing.plugin.extension.mogu;

import com.doing.plugin.BizCode;
import com.doing.plugin.extension.ExtensionFacade;
import com.doing.plugin.extension.ModifyExtension1;
import com.doing.plugin.extension.ModifyExtension2;
import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 19:44
 */
@BizCode("mogu")
public class MoguExtensionFacade implements ExtensionFacade {
    @Override
    public PreAndPostExtension getPreAndPostExtension() {
        return new MoguPreAndPostExtension();
    }

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new MoguModifyExtension1();
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new MoguModifyExtension2();
    }
}
