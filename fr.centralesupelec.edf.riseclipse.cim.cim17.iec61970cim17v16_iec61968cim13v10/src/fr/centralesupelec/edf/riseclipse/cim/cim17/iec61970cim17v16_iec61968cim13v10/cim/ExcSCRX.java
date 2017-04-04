/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exc SCRX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getCswitch <em>Cswitch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getRcrfd <em>Rcrfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTatb <em>Tatb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTe <em>Te</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX()
 * @model
 * @generated
 */
public interface ExcSCRX extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Cswitch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cswitch</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cswitch</em>' attribute.
     * @see #isSetCswitch()
     * @see #unsetCswitch()
     * @see #setCswitch(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Cswitch()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.cswitch' kind='element'"
     * @generated
     */
    Boolean getCswitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getCswitch <em>Cswitch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cswitch</em>' attribute.
     * @see #isSetCswitch()
     * @see #unsetCswitch()
     * @see #getCswitch()
     * @generated
     */
    void setCswitch( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getCswitch <em>Cswitch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCswitch()
     * @see #getCswitch()
     * @see #setCswitch(Boolean)
     * @generated
     */
    void unsetCswitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getCswitch <em>Cswitch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cswitch</em>' attribute is set.
     * @see #unsetCswitch()
     * @see #getCswitch()
     * @see #setCswitch(Boolean)
     * @generated
     */
    boolean isSetCswitch();

    /**
     * Returns the value of the '<em><b>Emax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #setEmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Emax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.emax' kind='element'"
     * @generated
     */
    Float getEmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #getEmax()
     * @generated
     */
    void setEmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmax()
     * @see #getEmax()
     * @see #setEmax(Float)
     * @generated
     */
    void unsetEmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmax <em>Emax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emax</em>' attribute is set.
     * @see #unsetEmax()
     * @see #getEmax()
     * @see #setEmax(Float)
     * @generated
     */
    boolean isSetEmax();

    /**
     * Returns the value of the '<em><b>Emin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #setEmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Emin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.emin' kind='element'"
     * @generated
     */
    Float getEmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #getEmin()
     * @generated
     */
    void setEmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmin()
     * @see #getEmin()
     * @see #setEmin(Float)
     * @generated
     */
    void unsetEmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getEmin <em>Emin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emin</em>' attribute is set.
     * @see #unsetEmin()
     * @see #getEmin()
     * @see #setEmin(Float)
     * @generated
     */
    boolean isSetEmin();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>K</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_K()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.k' kind='element'"
     * @generated
     */
    Float getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #getK()
     * @generated
     */
    void setK( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Float)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getK <em>K</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K</em>' attribute is set.
     * @see #unsetK()
     * @see #getK()
     * @see #setK(Float)
     * @generated
     */
    boolean isSetK();

    /**
     * Returns the value of the '<em><b>Rcrfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rcrfd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rcrfd</em>' attribute.
     * @see #isSetRcrfd()
     * @see #unsetRcrfd()
     * @see #setRcrfd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Rcrfd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.rcrfd' kind='element'"
     * @generated
     */
    Float getRcrfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getRcrfd <em>Rcrfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcrfd</em>' attribute.
     * @see #isSetRcrfd()
     * @see #unsetRcrfd()
     * @see #getRcrfd()
     * @generated
     */
    void setRcrfd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getRcrfd <em>Rcrfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcrfd()
     * @see #getRcrfd()
     * @see #setRcrfd(Float)
     * @generated
     */
    void unsetRcrfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getRcrfd <em>Rcrfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcrfd</em>' attribute is set.
     * @see #unsetRcrfd()
     * @see #getRcrfd()
     * @see #setRcrfd(Float)
     * @generated
     */
    boolean isSetRcrfd();

    /**
     * Returns the value of the '<em><b>Tatb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tatb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tatb</em>' attribute.
     * @see #isSetTatb()
     * @see #unsetTatb()
     * @see #setTatb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Tatb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.tatb' kind='element'"
     * @generated
     */
    Float getTatb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTatb <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tatb</em>' attribute.
     * @see #isSetTatb()
     * @see #unsetTatb()
     * @see #getTatb()
     * @generated
     */
    void setTatb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTatb <em>Tatb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTatb()
     * @see #getTatb()
     * @see #setTatb(Float)
     * @generated
     */
    void unsetTatb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTatb <em>Tatb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tatb</em>' attribute is set.
     * @see #unsetTatb()
     * @see #getTatb()
     * @see #setTatb(Float)
     * @generated
     */
    boolean isSetTatb();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Tb()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.tb' kind='element'"
     * @generated
     */
    Float getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Float)
     * @generated
     */
    boolean isSetTb();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Te</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcSCRX_Te()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcSCRX.te' kind='element'"
     * @generated
     */
    Float getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSCRX#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Float)
     * @generated
     */
    boolean isSetTe();

} // ExcSCRX
