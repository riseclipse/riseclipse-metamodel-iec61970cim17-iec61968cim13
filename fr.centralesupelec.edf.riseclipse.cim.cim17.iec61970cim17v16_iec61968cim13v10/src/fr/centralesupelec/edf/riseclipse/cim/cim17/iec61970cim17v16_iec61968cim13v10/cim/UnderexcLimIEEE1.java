/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underexc Lim IEEE1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1()
 * @model
 * @generated
 */
public interface UnderexcLimIEEE1 extends UnderexcitationLimiterDynamics {
    /**
     * Returns the value of the '<em><b>Kuc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kuc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kuc</em>' attribute.
     * @see #isSetKuc()
     * @see #unsetKuc()
     * @see #setKuc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Kuc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.kuc' kind='element'"
     * @generated
     */
    Float getKuc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kuc</em>' attribute.
     * @see #isSetKuc()
     * @see #unsetKuc()
     * @see #getKuc()
     * @generated
     */
    void setKuc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKuc()
     * @see #getKuc()
     * @see #setKuc(Float)
     * @generated
     */
    void unsetKuc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuc <em>Kuc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kuc</em>' attribute is set.
     * @see #unsetKuc()
     * @see #getKuc()
     * @see #setKuc(Float)
     * @generated
     */
    boolean isSetKuc();

    /**
     * Returns the value of the '<em><b>Kuf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kuf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kuf</em>' attribute.
     * @see #isSetKuf()
     * @see #unsetKuf()
     * @see #setKuf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Kuf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.kuf' kind='element'"
     * @generated
     */
    Float getKuf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kuf</em>' attribute.
     * @see #isSetKuf()
     * @see #unsetKuf()
     * @see #getKuf()
     * @generated
     */
    void setKuf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKuf()
     * @see #getKuf()
     * @see #setKuf(Float)
     * @generated
     */
    void unsetKuf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKuf <em>Kuf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kuf</em>' attribute is set.
     * @see #unsetKuf()
     * @see #getKuf()
     * @see #setKuf(Float)
     * @generated
     */
    boolean isSetKuf();

    /**
     * Returns the value of the '<em><b>Kui</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kui</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #setKui(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Kui()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.kui' kind='element'"
     * @generated
     */
    Float getKui();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kui</em>' attribute.
     * @see #isSetKui()
     * @see #unsetKui()
     * @see #getKui()
     * @generated
     */
    void setKui( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKui()
     * @see #getKui()
     * @see #setKui(Float)
     * @generated
     */
    void unsetKui();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKui <em>Kui</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kui</em>' attribute is set.
     * @see #unsetKui()
     * @see #getKui()
     * @see #setKui(Float)
     * @generated
     */
    boolean isSetKui();

    /**
     * Returns the value of the '<em><b>Kul</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kul</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kul</em>' attribute.
     * @see #isSetKul()
     * @see #unsetKul()
     * @see #setKul(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Kul()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.kul' kind='element'"
     * @generated
     */
    Float getKul();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kul</em>' attribute.
     * @see #isSetKul()
     * @see #unsetKul()
     * @see #getKul()
     * @generated
     */
    void setKul( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKul()
     * @see #getKul()
     * @see #setKul(Float)
     * @generated
     */
    void unsetKul();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKul <em>Kul</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kul</em>' attribute is set.
     * @see #unsetKul()
     * @see #getKul()
     * @see #setKul(Float)
     * @generated
     */
    boolean isSetKul();

    /**
     * Returns the value of the '<em><b>Kur</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kur</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kur</em>' attribute.
     * @see #isSetKur()
     * @see #unsetKur()
     * @see #setKur(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Kur()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.kur' kind='element'"
     * @generated
     */
    Float getKur();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kur</em>' attribute.
     * @see #isSetKur()
     * @see #unsetKur()
     * @see #getKur()
     * @generated
     */
    void setKur( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKur()
     * @see #getKur()
     * @see #setKur(Float)
     * @generated
     */
    void unsetKur();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getKur <em>Kur</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kur</em>' attribute is set.
     * @see #unsetKur()
     * @see #getKur()
     * @see #setKur(Float)
     * @generated
     */
    boolean isSetKur();

    /**
     * Returns the value of the '<em><b>Tu1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tu1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tu1</em>' attribute.
     * @see #isSetTu1()
     * @see #unsetTu1()
     * @see #setTu1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Tu1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.tu1' kind='element'"
     * @generated
     */
    Float getTu1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu1</em>' attribute.
     * @see #isSetTu1()
     * @see #unsetTu1()
     * @see #getTu1()
     * @generated
     */
    void setTu1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu1()
     * @see #getTu1()
     * @see #setTu1(Float)
     * @generated
     */
    void unsetTu1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu1 <em>Tu1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu1</em>' attribute is set.
     * @see #unsetTu1()
     * @see #getTu1()
     * @see #setTu1(Float)
     * @generated
     */
    boolean isSetTu1();

    /**
     * Returns the value of the '<em><b>Tu2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tu2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tu2</em>' attribute.
     * @see #isSetTu2()
     * @see #unsetTu2()
     * @see #setTu2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Tu2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.tu2' kind='element'"
     * @generated
     */
    Float getTu2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu2</em>' attribute.
     * @see #isSetTu2()
     * @see #unsetTu2()
     * @see #getTu2()
     * @generated
     */
    void setTu2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu2()
     * @see #getTu2()
     * @see #setTu2(Float)
     * @generated
     */
    void unsetTu2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu2 <em>Tu2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu2</em>' attribute is set.
     * @see #unsetTu2()
     * @see #getTu2()
     * @see #setTu2(Float)
     * @generated
     */
    boolean isSetTu2();

    /**
     * Returns the value of the '<em><b>Tu3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tu3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tu3</em>' attribute.
     * @see #isSetTu3()
     * @see #unsetTu3()
     * @see #setTu3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Tu3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.tu3' kind='element'"
     * @generated
     */
    Float getTu3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu3</em>' attribute.
     * @see #isSetTu3()
     * @see #unsetTu3()
     * @see #getTu3()
     * @generated
     */
    void setTu3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu3()
     * @see #getTu3()
     * @see #setTu3(Float)
     * @generated
     */
    void unsetTu3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu3 <em>Tu3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu3</em>' attribute is set.
     * @see #unsetTu3()
     * @see #getTu3()
     * @see #setTu3(Float)
     * @generated
     */
    boolean isSetTu3();

    /**
     * Returns the value of the '<em><b>Tu4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tu4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tu4</em>' attribute.
     * @see #isSetTu4()
     * @see #unsetTu4()
     * @see #setTu4(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Tu4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.tu4' kind='element'"
     * @generated
     */
    Float getTu4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tu4</em>' attribute.
     * @see #isSetTu4()
     * @see #unsetTu4()
     * @see #getTu4()
     * @generated
     */
    void setTu4( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTu4()
     * @see #getTu4()
     * @see #setTu4(Float)
     * @generated
     */
    void unsetTu4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getTu4 <em>Tu4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tu4</em>' attribute is set.
     * @see #unsetTu4()
     * @see #getTu4()
     * @see #setTu4(Float)
     * @generated
     */
    boolean isSetTu4();

    /**
     * Returns the value of the '<em><b>Vucmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vucmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vucmax</em>' attribute.
     * @see #isSetVucmax()
     * @see #unsetVucmax()
     * @see #setVucmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vucmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vucmax' kind='element'"
     * @generated
     */
    Float getVucmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vucmax</em>' attribute.
     * @see #isSetVucmax()
     * @see #unsetVucmax()
     * @see #getVucmax()
     * @generated
     */
    void setVucmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVucmax()
     * @see #getVucmax()
     * @see #setVucmax(Float)
     * @generated
     */
    void unsetVucmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVucmax <em>Vucmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vucmax</em>' attribute is set.
     * @see #unsetVucmax()
     * @see #getVucmax()
     * @see #setVucmax(Float)
     * @generated
     */
    boolean isSetVucmax();

    /**
     * Returns the value of the '<em><b>Vuimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vuimax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #setVuimax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vuimax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vuimax' kind='element'"
     * @generated
     */
    Float getVuimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vuimax</em>' attribute.
     * @see #isSetVuimax()
     * @see #unsetVuimax()
     * @see #getVuimax()
     * @generated
     */
    void setVuimax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Float)
     * @generated
     */
    void unsetVuimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimax <em>Vuimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimax</em>' attribute is set.
     * @see #unsetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Float)
     * @generated
     */
    boolean isSetVuimax();

    /**
     * Returns the value of the '<em><b>Vuimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vuimin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #setVuimin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vuimin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vuimin' kind='element'"
     * @generated
     */
    Float getVuimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vuimin</em>' attribute.
     * @see #isSetVuimin()
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @generated
     */
    void setVuimin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Float)
     * @generated
     */
    void unsetVuimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVuimin <em>Vuimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimin</em>' attribute is set.
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Float)
     * @generated
     */
    boolean isSetVuimin();

    /**
     * Returns the value of the '<em><b>Vulmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vulmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vulmax</em>' attribute.
     * @see #isSetVulmax()
     * @see #unsetVulmax()
     * @see #setVulmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vulmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vulmax' kind='element'"
     * @generated
     */
    Float getVulmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vulmax</em>' attribute.
     * @see #isSetVulmax()
     * @see #unsetVulmax()
     * @see #getVulmax()
     * @generated
     */
    void setVulmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmax()
     * @see #getVulmax()
     * @see #setVulmax(Float)
     * @generated
     */
    void unsetVulmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmax <em>Vulmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vulmax</em>' attribute is set.
     * @see #unsetVulmax()
     * @see #getVulmax()
     * @see #setVulmax(Float)
     * @generated
     */
    boolean isSetVulmax();

    /**
     * Returns the value of the '<em><b>Vulmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vulmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vulmin</em>' attribute.
     * @see #isSetVulmin()
     * @see #unsetVulmin()
     * @see #setVulmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vulmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vulmin' kind='element'"
     * @generated
     */
    Float getVulmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vulmin</em>' attribute.
     * @see #isSetVulmin()
     * @see #unsetVulmin()
     * @see #getVulmin()
     * @generated
     */
    void setVulmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVulmin()
     * @see #getVulmin()
     * @see #setVulmin(Float)
     * @generated
     */
    void unsetVulmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVulmin <em>Vulmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vulmin</em>' attribute is set.
     * @see #unsetVulmin()
     * @see #getVulmin()
     * @see #setVulmin(Float)
     * @generated
     */
    boolean isSetVulmin();

    /**
     * Returns the value of the '<em><b>Vurmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vurmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vurmax</em>' attribute.
     * @see #isSetVurmax()
     * @see #unsetVurmax()
     * @see #setVurmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLimIEEE1_Vurmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLimIEEE1.vurmax' kind='element'"
     * @generated
     */
    Float getVurmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vurmax</em>' attribute.
     * @see #isSetVurmax()
     * @see #unsetVurmax()
     * @see #getVurmax()
     * @generated
     */
    void setVurmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVurmax()
     * @see #getVurmax()
     * @see #setVurmax(Float)
     * @generated
     */
    void unsetVurmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1#getVurmax <em>Vurmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vurmax</em>' attribute is set.
     * @see #unsetVurmax()
     * @see #getVurmax()
     * @see #setVurmax(Float)
     * @generated
     */
    boolean isSetVurmax();

} // UnderexcLimIEEE1
