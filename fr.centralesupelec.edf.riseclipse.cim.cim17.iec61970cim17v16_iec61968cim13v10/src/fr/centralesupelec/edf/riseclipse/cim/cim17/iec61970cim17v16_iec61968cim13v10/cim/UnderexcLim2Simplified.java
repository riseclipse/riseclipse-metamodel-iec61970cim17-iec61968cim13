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
 * A representation of the model object '<em><b>Underexc Lim2 Simplified</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified()
 * @model
 * @generated
 */
public interface UnderexcLim2Simplified extends UnderexcitationLimiterDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_Kui()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.kui' kind='element'"
     * @generated
     */
    Float getKui();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKui()
     * @see #getKui()
     * @see #setKui(Float)
     * @generated
     */
    void unsetKui();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getKui <em>Kui</em>}' attribute is set.
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
     * Returns the value of the '<em><b>P0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>P0</em>' attribute.
     * @see #isSetP0()
     * @see #unsetP0()
     * @see #setP0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_P0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.p0' kind='element'"
     * @generated
     */
    Float getP0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P0</em>' attribute.
     * @see #isSetP0()
     * @see #unsetP0()
     * @see #getP0()
     * @generated
     */
    void setP0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP0()
     * @see #getP0()
     * @see #setP0(Float)
     * @generated
     */
    void unsetP0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP0 <em>P0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P0</em>' attribute is set.
     * @see #unsetP0()
     * @see #getP0()
     * @see #setP0(Float)
     * @generated
     */
    boolean isSetP0();

    /**
     * Returns the value of the '<em><b>P1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>P1</em>' attribute.
     * @see #isSetP1()
     * @see #unsetP1()
     * @see #setP1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_P1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.p1' kind='element'"
     * @generated
     */
    Float getP1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P1</em>' attribute.
     * @see #isSetP1()
     * @see #unsetP1()
     * @see #getP1()
     * @generated
     */
    void setP1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP1()
     * @see #getP1()
     * @see #setP1(Float)
     * @generated
     */
    void unsetP1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getP1 <em>P1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P1</em>' attribute is set.
     * @see #unsetP1()
     * @see #getP1()
     * @see #setP1(Float)
     * @generated
     */
    boolean isSetP1();

    /**
     * Returns the value of the '<em><b>Q0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Q0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Q0</em>' attribute.
     * @see #isSetQ0()
     * @see #unsetQ0()
     * @see #setQ0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_Q0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.q0' kind='element'"
     * @generated
     */
    Float getQ0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q0</em>' attribute.
     * @see #isSetQ0()
     * @see #unsetQ0()
     * @see #getQ0()
     * @generated
     */
    void setQ0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ0()
     * @see #getQ0()
     * @see #setQ0(Float)
     * @generated
     */
    void unsetQ0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ0 <em>Q0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q0</em>' attribute is set.
     * @see #unsetQ0()
     * @see #getQ0()
     * @see #setQ0(Float)
     * @generated
     */
    boolean isSetQ0();

    /**
     * Returns the value of the '<em><b>Q1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Q1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Q1</em>' attribute.
     * @see #isSetQ1()
     * @see #unsetQ1()
     * @see #setQ1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_Q1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.q1' kind='element'"
     * @generated
     */
    Float getQ1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q1</em>' attribute.
     * @see #isSetQ1()
     * @see #unsetQ1()
     * @see #getQ1()
     * @generated
     */
    void setQ1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ1()
     * @see #getQ1()
     * @see #setQ1(Float)
     * @generated
     */
    void unsetQ1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getQ1 <em>Q1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q1</em>' attribute is set.
     * @see #unsetQ1()
     * @see #getQ1()
     * @see #setQ1(Float)
     * @generated
     */
    boolean isSetQ1();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_Vuimax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.vuimax' kind='element'"
     * @generated
     */
    Float getVuimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimax()
     * @see #getVuimax()
     * @see #setVuimax(Float)
     * @generated
     */
    void unsetVuimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimax <em>Vuimax</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnderexcLim2Simplified_Vuimin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='UnderexcLim2Simplified.vuimin' kind='element'"
     * @generated
     */
    Float getVuimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Float)
     * @generated
     */
    void unsetVuimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified#getVuimin <em>Vuimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vuimin</em>' attribute is set.
     * @see #unsetVuimin()
     * @see #getVuimin()
     * @see #setVuimin(Float)
     * @generated
     */
    boolean isSetVuimin();

} // UnderexcLim2Simplified
