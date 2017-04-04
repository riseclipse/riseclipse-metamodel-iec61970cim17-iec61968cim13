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
 * A representation of the model object '<em><b>Gov GAST4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getKtm <em>Ktm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymn <em>Rymn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymx <em>Rymx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTcm <em>Tcm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTv <em>Tv</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4()
 * @model
 * @generated
 */
public interface GovGAST4 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Bp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #setBp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Bp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.bp' kind='element'"
     * @generated
     */
    Float getBp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #getBp()
     * @generated
     */
    void setBp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBp()
     * @see #getBp()
     * @see #setBp(Float)
     * @generated
     */
    void unsetBp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getBp <em>Bp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bp</em>' attribute is set.
     * @see #unsetBp()
     * @see #getBp()
     * @see #setBp(Float)
     * @generated
     */
    boolean isSetBp();

    /**
     * Returns the value of the '<em><b>Ktm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ktm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ktm</em>' attribute.
     * @see #isSetKtm()
     * @see #unsetKtm()
     * @see #setKtm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Ktm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.ktm' kind='element'"
     * @generated
     */
    Float getKtm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ktm</em>' attribute.
     * @see #isSetKtm()
     * @see #unsetKtm()
     * @see #getKtm()
     * @generated
     */
    void setKtm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKtm()
     * @see #getKtm()
     * @see #setKtm(Float)
     * @generated
     */
    void unsetKtm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ktm</em>' attribute is set.
     * @see #unsetKtm()
     * @see #getKtm()
     * @see #setKtm(Float)
     * @generated
     */
    boolean isSetKtm();

    /**
     * Returns the value of the '<em><b>Mnef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mnef</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #setMnef(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Mnef()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.mnef' kind='element'"
     * @generated
     */
    Float getMnef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #getMnef()
     * @generated
     */
    void setMnef( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMnef()
     * @see #getMnef()
     * @see #setMnef(Float)
     * @generated
     */
    void unsetMnef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mnef</em>' attribute is set.
     * @see #unsetMnef()
     * @see #getMnef()
     * @see #setMnef(Float)
     * @generated
     */
    boolean isSetMnef();

    /**
     * Returns the value of the '<em><b>Mxef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mxef</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #setMxef(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Mxef()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.mxef' kind='element'"
     * @generated
     */
    Float getMxef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #getMxef()
     * @generated
     */
    void setMxef( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMxef()
     * @see #getMxef()
     * @see #setMxef(Float)
     * @generated
     */
    void unsetMxef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mxef</em>' attribute is set.
     * @see #unsetMxef()
     * @see #getMxef()
     * @see #setMxef(Float)
     * @generated
     */
    boolean isSetMxef();

    /**
     * Returns the value of the '<em><b>Rymn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rymn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rymn</em>' attribute.
     * @see #isSetRymn()
     * @see #unsetRymn()
     * @see #setRymn(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Rymn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.rymn' kind='element'"
     * @generated
     */
    Float getRymn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rymn</em>' attribute.
     * @see #isSetRymn()
     * @see #unsetRymn()
     * @see #getRymn()
     * @generated
     */
    void setRymn( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRymn()
     * @see #getRymn()
     * @see #setRymn(Float)
     * @generated
     */
    void unsetRymn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rymn</em>' attribute is set.
     * @see #unsetRymn()
     * @see #getRymn()
     * @see #setRymn(Float)
     * @generated
     */
    boolean isSetRymn();

    /**
     * Returns the value of the '<em><b>Rymx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rymx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rymx</em>' attribute.
     * @see #isSetRymx()
     * @see #unsetRymx()
     * @see #setRymx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Rymx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.rymx' kind='element'"
     * @generated
     */
    Float getRymx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rymx</em>' attribute.
     * @see #isSetRymx()
     * @see #unsetRymx()
     * @see #getRymx()
     * @generated
     */
    void setRymx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRymx()
     * @see #getRymx()
     * @see #setRymx(Float)
     * @generated
     */
    void unsetRymx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rymx</em>' attribute is set.
     * @see #unsetRymx()
     * @see #getRymx()
     * @see #setRymx(Float)
     * @generated
     */
    boolean isSetRymx();

    /**
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Ta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.ta' kind='element'"
     * @generated
     */
    Float getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #getTa()
     * @generated
     */
    void setTa( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTa <em>Ta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ta</em>' attribute is set.
     * @see #unsetTa()
     * @see #getTa()
     * @see #setTa(Float)
     * @generated
     */
    boolean isSetTa();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Tc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.tc' kind='element'"
     * @generated
     */
    Float getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Float)
     * @generated
     */
    boolean isSetTc();

    /**
     * Returns the value of the '<em><b>Tcm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tcm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #setTcm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Tcm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.tcm' kind='element'"
     * @generated
     */
    Float getTcm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #getTcm()
     * @generated
     */
    void setTcm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTcm()
     * @see #getTcm()
     * @see #setTcm(Float)
     * @generated
     */
    void unsetTcm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcm</em>' attribute is set.
     * @see #unsetTcm()
     * @see #getTcm()
     * @see #setTcm(Float)
     * @generated
     */
    boolean isSetTcm();

    /**
     * Returns the value of the '<em><b>Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #setTm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Tm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.tm' kind='element'"
     * @generated
     */
    Float getTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #getTm()
     * @generated
     */
    void setTm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTm()
     * @see #getTm()
     * @see #setTm(Float)
     * @generated
     */
    void unsetTm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTm <em>Tm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tm</em>' attribute is set.
     * @see #unsetTm()
     * @see #getTm()
     * @see #setTm(Float)
     * @generated
     */
    boolean isSetTm();

    /**
     * Returns the value of the '<em><b>Tv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #setTv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGovGAST4_Tv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GovGAST4.tv' kind='element'"
     * @generated
     */
    Float getTv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #getTv()
     * @generated
     */
    void setTv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTv()
     * @see #getTv()
     * @see #setTv(Float)
     * @generated
     */
    void unsetTv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST4#getTv <em>Tv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tv</em>' attribute is set.
     * @see #unsetTv()
     * @see #getTv()
     * @see #setTv(Float)
     * @generated
     */
    boolean isSetTv();

} // GovGAST4
