package model;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 10 12:20:58 CEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SavepointTableImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        IdSavepoint,
        NameSavepoint;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int IDSAVEPOINT = AttributesEnum.IdSavepoint.index();
    public static final int NAMESAVEPOINT = AttributesEnum.NameSavepoint.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SavepointTableImpl() {
    }

    /**
     * Gets the attribute value for IdSavepoint, using the alias name IdSavepoint.
     * @return the value of IdSavepoint
     */
    public String getIdSavepoint() {
        return (String) getAttributeInternal(IDSAVEPOINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdSavepoint.
     * @param value value to set the IdSavepoint
     */
    public void setIdSavepoint(String value) {
        setAttributeInternal(IDSAVEPOINT, value);
    }

    /**
     * Gets the attribute value for NameSavepoint, using the alias name NameSavepoint.
     * @return the value of NameSavepoint
     */
    public String getNameSavepoint() {
        return (String) getAttributeInternal(NAMESAVEPOINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for NameSavepoint.
     * @param value value to set the NameSavepoint
     */
    public void setNameSavepoint(String value) {
        setAttributeInternal(NAMESAVEPOINT, value);
    }

    /**
     * @param idSavepoint key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String idSavepoint) {
        return new Key(new Object[] { idSavepoint });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.SavepointTable");
    }
}

