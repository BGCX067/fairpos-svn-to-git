//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.editor;

import com.openbravo.basic.BasicException;
import com.openbravo.format.Formats;

public class JEditorCurrency extends JEditorNumber {
    
	private static final long serialVersionUID = 5096754100573262803L;
	
    /** 
         * Creates a new instance of JEditorCurrency 
         * 
         * This editor works with cent entry but returns a double/String with 
         * comma automatically.
         */
    public JEditorCurrency() {
    }
    
    @Override
    protected Formats getFormat() {
        return Formats.CURRENCY;
    }
    @Override
    protected int getMode() {
        return EditorKeys.MODE_DOUBLE;
    }  

    @Override
    protected String getTextFormat() throws BasicException {
        if (m_fmt == null || getDoubleValue() == null)
            return null;
        return m_fmt.formatValue(getDoubleValue() / 100);
    }
    
    @Override
    public Double getDoubleValue() {  
        Double value = super.getDoubleValue();
        if (value == null)
            return null;
        return value;
    }
    
}
