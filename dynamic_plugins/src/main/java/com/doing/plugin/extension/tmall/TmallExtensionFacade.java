package com.doing.plugin.extension.tmall;

import com.doing.plugin.BizCode;
import com.doing.plugin.plugin.extension.ExtensionFacade;
import com.doing.plugin.plugin.extension.ModifyExtension1;
import com.doing.plugin.plugin.extension.ModifyExtension2;
import com.doing.plugin.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 19:44
 */
@BizCode("tmall")
public class TmallExtensionFacade implements ExtensionFacade {
    @Override
    public PreAndPostExtension getPreAndPostExtension() {
        return new TmallPreAndPostExtension();
    }

    @Override
    public ModifyExtension1 getModifyExtension1() {
        return new TmallModifyExtension1();
    }

    @Override
    public ModifyExtension2 getModifyExtension2() {
        return new TmallModifyExtension2();
    }
}
