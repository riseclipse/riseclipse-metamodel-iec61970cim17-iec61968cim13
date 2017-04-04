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
 * A representation of the model object '<em><b>Heat Input Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve()
 * @model
 * @generated
 */
public interface HeatInputCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Aux Power Mult</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Power Mult</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Power Mult</em>' attribute.
     * @see #isSetAuxPowerMult()
     * @see #unsetAuxPowerMult()
     * @see #setAuxPowerMult(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_AuxPowerMult()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.auxPowerMult' kind='element'"
     * @generated
     */
    Float getAuxPowerMult();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Power Mult</em>' attribute.
     * @see #isSetAuxPowerMult()
     * @see #unsetAuxPowerMult()
     * @see #getAuxPowerMult()
     * @generated
     */
    void setAuxPowerMult( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxPowerMult()
     * @see #getAuxPowerMult()
     * @see #setAuxPowerMult(Float)
     * @generated
     */
    void unsetAuxPowerMult();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Power Mult</em>' attribute is set.
     * @see #unsetAuxPowerMult()
     * @see #getAuxPowerMult()
     * @see #setAuxPowerMult(Float)
     * @generated
     */
    boolean isSetAuxPowerMult();

    /**
     * Returns the value of the '<em><b>Aux Power Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Power Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Power Offset</em>' attribute.
     * @see #isSetAuxPowerOffset()
     * @see #unsetAuxPowerOffset()
     * @see #setAuxPowerOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_AuxPowerOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.auxPowerOffset' kind='element'"
     * @generated
     */
    Float getAuxPowerOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Power Offset</em>' attribute.
     * @see #isSetAuxPowerOffset()
     * @see #unsetAuxPowerOffset()
     * @see #getAuxPowerOffset()
     * @generated
     */
    void setAuxPowerOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxPowerOffset()
     * @see #getAuxPowerOffset()
     * @see #setAuxPowerOffset(Float)
     * @generated
     */
    void unsetAuxPowerOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Power Offset</em>' attribute is set.
     * @see #unsetAuxPowerOffset()
     * @see #getAuxPowerOffset()
     * @see #setAuxPowerOffset(Float)
     * @generated
     */
    boolean isSetAuxPowerOffset();

    /**
     * Returns the value of the '<em><b>Heat Input Eff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Input Eff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Input Eff</em>' attribute.
     * @see #isSetHeatInputEff()
     * @see #unsetHeatInputEff()
     * @see #setHeatInputEff(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_HeatInputEff()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.heatInputEff' kind='element'"
     * @generated
     */
    Float getHeatInputEff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Input Eff</em>' attribute.
     * @see #isSetHeatInputEff()
     * @see #unsetHeatInputEff()
     * @see #getHeatInputEff()
     * @generated
     */
    void setHeatInputEff( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatInputEff()
     * @see #getHeatInputEff()
     * @see #setHeatInputEff(Float)
     * @generated
     */
    void unsetHeatInputEff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Input Eff</em>' attribute is set.
     * @see #unsetHeatInputEff()
     * @see #getHeatInputEff()
     * @see #setHeatInputEff(Float)
     * @generated
     */
    boolean isSetHeatInputEff();

    /**
     * Returns the value of the '<em><b>Heat Input Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Input Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Input Offset</em>' attribute.
     * @see #isSetHeatInputOffset()
     * @see #unsetHeatInputOffset()
     * @see #setHeatInputOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_HeatInputOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.heatInputOffset' kind='element'"
     * @generated
     */
    Float getHeatInputOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Input Offset</em>' attribute.
     * @see #isSetHeatInputOffset()
     * @see #unsetHeatInputOffset()
     * @see #getHeatInputOffset()
     * @generated
     */
    void setHeatInputOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatInputOffset()
     * @see #getHeatInputOffset()
     * @see #setHeatInputOffset(Float)
     * @generated
     */
    void unsetHeatInputOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Input Offset</em>' attribute is set.
     * @see #unsetHeatInputOffset()
     * @see #getHeatInputOffset()
     * @see #setHeatInputOffset(Float)
     * @generated
     */
    boolean isSetHeatInputOffset();

    /**
     * Returns the value of the '<em><b>Is Net Gross P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Net Gross P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Net Gross P</em>' attribute.
     * @see #isSetIsNetGrossP()
     * @see #unsetIsNetGrossP()
     * @see #setIsNetGrossP(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_IsNetGrossP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.isNetGrossP' kind='element'"
     * @generated
     */
    Boolean getIsNetGrossP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getIsNetGrossP <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Net Gross P</em>' attribute.
     * @see #isSetIsNetGrossP()
     * @see #unsetIsNetGrossP()
     * @see #getIsNetGrossP()
     * @generated
     */
    void setIsNetGrossP( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getIsNetGrossP <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsNetGrossP()
     * @see #getIsNetGrossP()
     * @see #setIsNetGrossP(Boolean)
     * @generated
     */
    void unsetIsNetGrossP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getIsNetGrossP <em>Is Net Gross P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Net Gross P</em>' attribute is set.
     * @see #unsetIsNetGrossP()
     * @see #getIsNetGrossP()
     * @see #setIsNetGrossP(Boolean)
     * @generated
     */
    boolean isSetIsNetGrossP();

    /**
     * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatInputCurve_ThermalGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve
     * @model opposite="HeatInputCurve" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatInputCurve.ThermalGeneratingUnit' kind='element'"
     * @generated
     */
    ThermalGeneratingUnit getThermalGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @generated
     */
    void setThermalGeneratingUnit( ThermalGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    void unsetThermalGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Unit</em>' reference is set.
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    boolean isSetThermalGeneratingUnit();

} // HeatInputCurve
