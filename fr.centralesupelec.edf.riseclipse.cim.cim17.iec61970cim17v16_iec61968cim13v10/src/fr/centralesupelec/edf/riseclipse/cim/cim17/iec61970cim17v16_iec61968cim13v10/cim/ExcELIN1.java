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
 * A representation of the model object '<em><b>Exc ELIN1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getDpnf <em>Dpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmax <em>Efmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmin <em>Efmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getSmax <em>Smax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTfi <em>Tfi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTnu <em>Tnu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs1 <em>Ts1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs2 <em>Ts2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTsw <em>Tsw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpi <em>Vpi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpnf <em>Vpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpu <em>Vpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getXe <em>Xe</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1()
 * @model
 * @generated
 */
public interface ExcELIN1 extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Dpnf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpnf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpnf</em>' attribute.
     * @see #isSetDpnf()
     * @see #unsetDpnf()
     * @see #setDpnf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Dpnf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.dpnf' kind='element'"
     * @generated
     */
    Float getDpnf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpnf</em>' attribute.
     * @see #isSetDpnf()
     * @see #unsetDpnf()
     * @see #getDpnf()
     * @generated
     */
    void setDpnf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpnf()
     * @see #getDpnf()
     * @see #setDpnf(Float)
     * @generated
     */
    void unsetDpnf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getDpnf <em>Dpnf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpnf</em>' attribute is set.
     * @see #unsetDpnf()
     * @see #getDpnf()
     * @see #setDpnf(Float)
     * @generated
     */
    boolean isSetDpnf();

    /**
     * Returns the value of the '<em><b>Efmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efmax</em>' attribute.
     * @see #isSetEfmax()
     * @see #unsetEfmax()
     * @see #setEfmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Efmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.efmax' kind='element'"
     * @generated
     */
    Float getEfmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efmax</em>' attribute.
     * @see #isSetEfmax()
     * @see #unsetEfmax()
     * @see #getEfmax()
     * @generated
     */
    void setEfmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfmax()
     * @see #getEfmax()
     * @see #setEfmax(Float)
     * @generated
     */
    void unsetEfmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmax <em>Efmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efmax</em>' attribute is set.
     * @see #unsetEfmax()
     * @see #getEfmax()
     * @see #setEfmax(Float)
     * @generated
     */
    boolean isSetEfmax();

    /**
     * Returns the value of the '<em><b>Efmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efmin</em>' attribute.
     * @see #isSetEfmin()
     * @see #unsetEfmin()
     * @see #setEfmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Efmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.efmin' kind='element'"
     * @generated
     */
    Float getEfmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efmin</em>' attribute.
     * @see #isSetEfmin()
     * @see #unsetEfmin()
     * @see #getEfmin()
     * @generated
     */
    void setEfmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfmin()
     * @see #getEfmin()
     * @see #setEfmin(Float)
     * @generated
     */
    void unsetEfmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getEfmin <em>Efmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efmin</em>' attribute is set.
     * @see #unsetEfmin()
     * @see #getEfmin()
     * @see #setEfmin(Float)
     * @generated
     */
    boolean isSetEfmin();

    /**
     * Returns the value of the '<em><b>Ks1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ks1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #setKs1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Ks1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.ks1' kind='element'"
     * @generated
     */
    Float getKs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #getKs1()
     * @generated
     */
    void setKs1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs1()
     * @see #getKs1()
     * @see #setKs1(Float)
     * @generated
     */
    void unsetKs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs1 <em>Ks1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks1</em>' attribute is set.
     * @see #unsetKs1()
     * @see #getKs1()
     * @see #setKs1(Float)
     * @generated
     */
    boolean isSetKs1();

    /**
     * Returns the value of the '<em><b>Ks2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ks2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #setKs2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Ks2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.ks2' kind='element'"
     * @generated
     */
    Float getKs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #getKs2()
     * @generated
     */
    void setKs2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs2()
     * @see #getKs2()
     * @see #setKs2(Float)
     * @generated
     */
    void unsetKs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getKs2 <em>Ks2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks2</em>' attribute is set.
     * @see #unsetKs2()
     * @see #getKs2()
     * @see #setKs2(Float)
     * @generated
     */
    boolean isSetKs2();

    /**
     * Returns the value of the '<em><b>Smax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smax</em>' attribute.
     * @see #isSetSmax()
     * @see #unsetSmax()
     * @see #setSmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Smax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.smax' kind='element'"
     * @generated
     */
    Float getSmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smax</em>' attribute.
     * @see #isSetSmax()
     * @see #unsetSmax()
     * @see #getSmax()
     * @generated
     */
    void setSmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSmax()
     * @see #getSmax()
     * @see #setSmax(Float)
     * @generated
     */
    void unsetSmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getSmax <em>Smax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Smax</em>' attribute is set.
     * @see #unsetSmax()
     * @see #getSmax()
     * @see #setSmax(Float)
     * @generated
     */
    boolean isSetSmax();

    /**
     * Returns the value of the '<em><b>Tfi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tfi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tfi</em>' attribute.
     * @see #isSetTfi()
     * @see #unsetTfi()
     * @see #setTfi(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Tfi()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.tfi' kind='element'"
     * @generated
     */
    Float getTfi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfi</em>' attribute.
     * @see #isSetTfi()
     * @see #unsetTfi()
     * @see #getTfi()
     * @generated
     */
    void setTfi( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfi()
     * @see #getTfi()
     * @see #setTfi(Float)
     * @generated
     */
    void unsetTfi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTfi <em>Tfi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfi</em>' attribute is set.
     * @see #unsetTfi()
     * @see #getTfi()
     * @see #setTfi(Float)
     * @generated
     */
    boolean isSetTfi();

    /**
     * Returns the value of the '<em><b>Tnu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tnu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tnu</em>' attribute.
     * @see #isSetTnu()
     * @see #unsetTnu()
     * @see #setTnu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Tnu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.tnu' kind='element'"
     * @generated
     */
    Float getTnu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tnu</em>' attribute.
     * @see #isSetTnu()
     * @see #unsetTnu()
     * @see #getTnu()
     * @generated
     */
    void setTnu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTnu()
     * @see #getTnu()
     * @see #setTnu(Float)
     * @generated
     */
    void unsetTnu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTnu <em>Tnu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tnu</em>' attribute is set.
     * @see #unsetTnu()
     * @see #getTnu()
     * @see #setTnu(Float)
     * @generated
     */
    boolean isSetTnu();

    /**
     * Returns the value of the '<em><b>Ts1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ts1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #setTs1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Ts1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.ts1' kind='element'"
     * @generated
     */
    Float getTs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #getTs1()
     * @generated
     */
    void setTs1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs1()
     * @see #getTs1()
     * @see #setTs1(Float)
     * @generated
     */
    void unsetTs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs1 <em>Ts1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts1</em>' attribute is set.
     * @see #unsetTs1()
     * @see #getTs1()
     * @see #setTs1(Float)
     * @generated
     */
    boolean isSetTs1();

    /**
     * Returns the value of the '<em><b>Ts2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ts2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #setTs2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Ts2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.ts2' kind='element'"
     * @generated
     */
    Float getTs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #getTs2()
     * @generated
     */
    void setTs2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs2()
     * @see #getTs2()
     * @see #setTs2(Float)
     * @generated
     */
    void unsetTs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTs2 <em>Ts2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts2</em>' attribute is set.
     * @see #unsetTs2()
     * @see #getTs2()
     * @see #setTs2(Float)
     * @generated
     */
    boolean isSetTs2();

    /**
     * Returns the value of the '<em><b>Tsw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tsw</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tsw</em>' attribute.
     * @see #isSetTsw()
     * @see #unsetTsw()
     * @see #setTsw(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Tsw()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.tsw' kind='element'"
     * @generated
     */
    Float getTsw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tsw</em>' attribute.
     * @see #isSetTsw()
     * @see #unsetTsw()
     * @see #getTsw()
     * @generated
     */
    void setTsw( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsw()
     * @see #getTsw()
     * @see #setTsw(Float)
     * @generated
     */
    void unsetTsw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getTsw <em>Tsw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsw</em>' attribute is set.
     * @see #unsetTsw()
     * @see #getTsw()
     * @see #setTsw(Float)
     * @generated
     */
    boolean isSetTsw();

    /**
     * Returns the value of the '<em><b>Vpi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpi</em>' attribute.
     * @see #isSetVpi()
     * @see #unsetVpi()
     * @see #setVpi(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Vpi()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.vpi' kind='element'"
     * @generated
     */
    Float getVpi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpi</em>' attribute.
     * @see #isSetVpi()
     * @see #unsetVpi()
     * @see #getVpi()
     * @generated
     */
    void setVpi( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpi()
     * @see #getVpi()
     * @see #setVpi(Float)
     * @generated
     */
    void unsetVpi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpi <em>Vpi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpi</em>' attribute is set.
     * @see #unsetVpi()
     * @see #getVpi()
     * @see #setVpi(Float)
     * @generated
     */
    boolean isSetVpi();

    /**
     * Returns the value of the '<em><b>Vpnf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpnf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpnf</em>' attribute.
     * @see #isSetVpnf()
     * @see #unsetVpnf()
     * @see #setVpnf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Vpnf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.vpnf' kind='element'"
     * @generated
     */
    Float getVpnf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpnf</em>' attribute.
     * @see #isSetVpnf()
     * @see #unsetVpnf()
     * @see #getVpnf()
     * @generated
     */
    void setVpnf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpnf()
     * @see #getVpnf()
     * @see #setVpnf(Float)
     * @generated
     */
    void unsetVpnf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpnf <em>Vpnf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpnf</em>' attribute is set.
     * @see #unsetVpnf()
     * @see #getVpnf()
     * @see #setVpnf(Float)
     * @generated
     */
    boolean isSetVpnf();

    /**
     * Returns the value of the '<em><b>Vpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vpu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vpu</em>' attribute.
     * @see #isSetVpu()
     * @see #unsetVpu()
     * @see #setVpu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Vpu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.vpu' kind='element'"
     * @generated
     */
    Float getVpu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vpu</em>' attribute.
     * @see #isSetVpu()
     * @see #unsetVpu()
     * @see #getVpu()
     * @generated
     */
    void setVpu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVpu()
     * @see #getVpu()
     * @see #setVpu(Float)
     * @generated
     */
    void unsetVpu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getVpu <em>Vpu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vpu</em>' attribute is set.
     * @see #unsetVpu()
     * @see #getVpu()
     * @see #setVpu(Float)
     * @generated
     */
    boolean isSetVpu();

    /**
     * Returns the value of the '<em><b>Xe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #setXe(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcELIN1_Xe()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExcELIN1.xe' kind='element'"
     * @generated
     */
    Float getXe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #getXe()
     * @generated
     */
    void setXe( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXe()
     * @see #getXe()
     * @see #setXe(Float)
     * @generated
     */
    void unsetXe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcELIN1#getXe <em>Xe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xe</em>' attribute is set.
     * @see #unsetXe()
     * @see #getXe()
     * @see #setXe(Float)
     * @generated
     */
    boolean isSetXe();

} // ExcELIN1
