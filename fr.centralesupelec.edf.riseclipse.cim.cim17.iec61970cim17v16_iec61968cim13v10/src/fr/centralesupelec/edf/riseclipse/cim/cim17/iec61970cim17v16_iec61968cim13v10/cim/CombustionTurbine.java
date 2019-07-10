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
 * A representation of the model object '<em><b>Combustion Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryFlag <em>Heat Recovery Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getTimeConstant <em>Time Constant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine()
 * @model
 * @generated
 */
public interface CombustionTurbine extends PrimeMover {
    /**
     * Returns the value of the '<em><b>Ambient Temp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ambient Temp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ambient Temp</em>' attribute.
     * @see #isSetAmbientTemp()
     * @see #unsetAmbientTemp()
     * @see #setAmbientTemp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_AmbientTemp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.ambientTemp' kind='element'"
     * @generated
     */
    Float getAmbientTemp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ambient Temp</em>' attribute.
     * @see #isSetAmbientTemp()
     * @see #unsetAmbientTemp()
     * @see #getAmbientTemp()
     * @generated
     */
    void setAmbientTemp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmbientTemp()
     * @see #getAmbientTemp()
     * @see #setAmbientTemp(Float)
     * @generated
     */
    void unsetAmbientTemp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAmbientTemp <em>Ambient Temp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ambient Temp</em>' attribute is set.
     * @see #unsetAmbientTemp()
     * @see #getAmbientTemp()
     * @see #setAmbientTemp(Float)
     * @generated
     */
    boolean isSetAmbientTemp();

    /**
     * Returns the value of the '<em><b>Aux Power Versus Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Power Versus Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Power Versus Frequency</em>' attribute.
     * @see #isSetAuxPowerVersusFrequency()
     * @see #unsetAuxPowerVersusFrequency()
     * @see #setAuxPowerVersusFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_AuxPowerVersusFrequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.auxPowerVersusFrequency' kind='element'"
     * @generated
     */
    Float getAuxPowerVersusFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Power Versus Frequency</em>' attribute.
     * @see #isSetAuxPowerVersusFrequency()
     * @see #unsetAuxPowerVersusFrequency()
     * @see #getAuxPowerVersusFrequency()
     * @generated
     */
    void setAuxPowerVersusFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxPowerVersusFrequency()
     * @see #getAuxPowerVersusFrequency()
     * @see #setAuxPowerVersusFrequency(Float)
     * @generated
     */
    void unsetAuxPowerVersusFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusFrequency <em>Aux Power Versus Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Power Versus Frequency</em>' attribute is set.
     * @see #unsetAuxPowerVersusFrequency()
     * @see #getAuxPowerVersusFrequency()
     * @see #setAuxPowerVersusFrequency(Float)
     * @generated
     */
    boolean isSetAuxPowerVersusFrequency();

    /**
     * Returns the value of the '<em><b>Aux Power Versus Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aux Power Versus Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aux Power Versus Voltage</em>' attribute.
     * @see #isSetAuxPowerVersusVoltage()
     * @see #unsetAuxPowerVersusVoltage()
     * @see #setAuxPowerVersusVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_AuxPowerVersusVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.auxPowerVersusVoltage' kind='element'"
     * @generated
     */
    Float getAuxPowerVersusVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aux Power Versus Voltage</em>' attribute.
     * @see #isSetAuxPowerVersusVoltage()
     * @see #unsetAuxPowerVersusVoltage()
     * @see #getAuxPowerVersusVoltage()
     * @generated
     */
    void setAuxPowerVersusVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxPowerVersusVoltage()
     * @see #getAuxPowerVersusVoltage()
     * @see #setAuxPowerVersusVoltage(Float)
     * @generated
     */
    void unsetAuxPowerVersusVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAuxPowerVersusVoltage <em>Aux Power Versus Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aux Power Versus Voltage</em>' attribute is set.
     * @see #unsetAuxPowerVersusVoltage()
     * @see #getAuxPowerVersusVoltage()
     * @see #setAuxPowerVersusVoltage(Float)
     * @generated
     */
    boolean isSetAuxPowerVersusVoltage();

    /**
     * Returns the value of the '<em><b>Capability Versus Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Versus Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Versus Frequency</em>' attribute.
     * @see #isSetCapabilityVersusFrequency()
     * @see #unsetCapabilityVersusFrequency()
     * @see #setCapabilityVersusFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_CapabilityVersusFrequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.capabilityVersusFrequency' kind='element'"
     * @generated
     */
    Float getCapabilityVersusFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Versus Frequency</em>' attribute.
     * @see #isSetCapabilityVersusFrequency()
     * @see #unsetCapabilityVersusFrequency()
     * @see #getCapabilityVersusFrequency()
     * @generated
     */
    void setCapabilityVersusFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityVersusFrequency()
     * @see #getCapabilityVersusFrequency()
     * @see #setCapabilityVersusFrequency(Float)
     * @generated
     */
    void unsetCapabilityVersusFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCapabilityVersusFrequency <em>Capability Versus Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Versus Frequency</em>' attribute is set.
     * @see #unsetCapabilityVersusFrequency()
     * @see #getCapabilityVersusFrequency()
     * @see #setCapabilityVersusFrequency(Float)
     * @generated
     */
    boolean isSetCapabilityVersusFrequency();

    /**
     * Returns the value of the '<em><b>Heat Recovery Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Recovery Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Recovery Flag</em>' attribute.
     * @see #isSetHeatRecoveryFlag()
     * @see #unsetHeatRecoveryFlag()
     * @see #setHeatRecoveryFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_HeatRecoveryFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.heatRecoveryFlag' kind='element'"
     * @generated
     */
    Boolean getHeatRecoveryFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Recovery Flag</em>' attribute.
     * @see #isSetHeatRecoveryFlag()
     * @see #unsetHeatRecoveryFlag()
     * @see #getHeatRecoveryFlag()
     * @generated
     */
    void setHeatRecoveryFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatRecoveryFlag()
     * @see #getHeatRecoveryFlag()
     * @see #setHeatRecoveryFlag(Boolean)
     * @generated
     */
    void unsetHeatRecoveryFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryFlag <em>Heat Recovery Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Recovery Flag</em>' attribute is set.
     * @see #unsetHeatRecoveryFlag()
     * @see #getHeatRecoveryFlag()
     * @see #setHeatRecoveryFlag(Boolean)
     * @generated
     */
    boolean isSetHeatRecoveryFlag();

    /**
     * Returns the value of the '<em><b>Power Variation By Temp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Variation By Temp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Variation By Temp</em>' attribute.
     * @see #isSetPowerVariationByTemp()
     * @see #unsetPowerVariationByTemp()
     * @see #setPowerVariationByTemp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_PowerVariationByTemp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.powerVariationByTemp' kind='element'"
     * @generated
     */
    Float getPowerVariationByTemp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Variation By Temp</em>' attribute.
     * @see #isSetPowerVariationByTemp()
     * @see #unsetPowerVariationByTemp()
     * @see #getPowerVariationByTemp()
     * @generated
     */
    void setPowerVariationByTemp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerVariationByTemp()
     * @see #getPowerVariationByTemp()
     * @see #setPowerVariationByTemp(Float)
     * @generated
     */
    void unsetPowerVariationByTemp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getPowerVariationByTemp <em>Power Variation By Temp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Variation By Temp</em>' attribute is set.
     * @see #unsetPowerVariationByTemp()
     * @see #getPowerVariationByTemp()
     * @see #setPowerVariationByTemp(Float)
     * @generated
     */
    boolean isSetPowerVariationByTemp();

    /**
     * Returns the value of the '<em><b>Reference Temp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Temp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Temp</em>' attribute.
     * @see #isSetReferenceTemp()
     * @see #unsetReferenceTemp()
     * @see #setReferenceTemp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_ReferenceTemp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.referenceTemp' kind='element'"
     * @generated
     */
    Float getReferenceTemp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Temp</em>' attribute.
     * @see #isSetReferenceTemp()
     * @see #unsetReferenceTemp()
     * @see #getReferenceTemp()
     * @generated
     */
    void setReferenceTemp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferenceTemp()
     * @see #getReferenceTemp()
     * @see #setReferenceTemp(Float)
     * @generated
     */
    void unsetReferenceTemp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getReferenceTemp <em>Reference Temp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reference Temp</em>' attribute is set.
     * @see #unsetReferenceTemp()
     * @see #getReferenceTemp()
     * @see #setReferenceTemp(Float)
     * @generated
     */
    boolean isSetReferenceTemp();

    /**
     * Returns the value of the '<em><b>Time Constant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Constant</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Constant</em>' attribute.
     * @see #isSetTimeConstant()
     * @see #unsetTimeConstant()
     * @see #setTimeConstant(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_TimeConstant()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.timeConstant' kind='element'"
     * @generated
     */
    Float getTimeConstant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Constant</em>' attribute.
     * @see #isSetTimeConstant()
     * @see #unsetTimeConstant()
     * @see #getTimeConstant()
     * @generated
     */
    void setTimeConstant( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeConstant()
     * @see #getTimeConstant()
     * @see #setTimeConstant(Float)
     * @generated
     */
    void unsetTimeConstant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getTimeConstant <em>Time Constant</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Constant</em>' attribute is set.
     * @see #unsetTimeConstant()
     * @see #getTimeConstant()
     * @see #setTimeConstant(Float)
     * @generated
     */
    boolean isSetTimeConstant();

    /**
     * Returns the value of the '<em><b>CT Temp Active Power Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine <em>Combustion Turbine</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CT Temp Active Power Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CT Temp Active Power Curve</em>' reference.
     * @see #isSetCTTempActivePowerCurve()
     * @see #unsetCTTempActivePowerCurve()
     * @see #setCTTempActivePowerCurve(CTTempActivePowerCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_CTTempActivePowerCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve#getCombustionTurbine
     * @model opposite="CombustionTurbine" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.CTTempActivePowerCurve' kind='element'"
     * @generated
     */
    CTTempActivePowerCurve getCTTempActivePowerCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CT Temp Active Power Curve</em>' reference.
     * @see #isSetCTTempActivePowerCurve()
     * @see #unsetCTTempActivePowerCurve()
     * @see #getCTTempActivePowerCurve()
     * @generated
     */
    void setCTTempActivePowerCurve( CTTempActivePowerCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCTTempActivePowerCurve()
     * @see #getCTTempActivePowerCurve()
     * @see #setCTTempActivePowerCurve(CTTempActivePowerCurve)
     * @generated
     */
    void unsetCTTempActivePowerCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getCTTempActivePowerCurve <em>CT Temp Active Power Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CT Temp Active Power Curve</em>' reference is set.
     * @see #unsetCTTempActivePowerCurve()
     * @see #getCTTempActivePowerCurve()
     * @see #setCTTempActivePowerCurve(CTTempActivePowerCurve)
     * @generated
     */
    boolean isSetCTTempActivePowerCurve();

    /**
     * Returns the value of the '<em><b>Heat Recovery Boiler</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Recovery Boiler</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Recovery Boiler</em>' reference.
     * @see #isSetHeatRecoveryBoiler()
     * @see #unsetHeatRecoveryBoiler()
     * @see #setHeatRecoveryBoiler(HeatRecoveryBoiler)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_HeatRecoveryBoiler()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getCombustionTurbines
     * @model opposite="CombustionTurbines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.HeatRecoveryBoiler' kind='element'"
     * @generated
     */
    HeatRecoveryBoiler getHeatRecoveryBoiler();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Recovery Boiler</em>' reference.
     * @see #isSetHeatRecoveryBoiler()
     * @see #unsetHeatRecoveryBoiler()
     * @see #getHeatRecoveryBoiler()
     * @generated
     */
    void setHeatRecoveryBoiler( HeatRecoveryBoiler value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatRecoveryBoiler()
     * @see #getHeatRecoveryBoiler()
     * @see #setHeatRecoveryBoiler(HeatRecoveryBoiler)
     * @generated
     */
    void unsetHeatRecoveryBoiler();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Recovery Boiler</em>' reference is set.
     * @see #unsetHeatRecoveryBoiler()
     * @see #getHeatRecoveryBoiler()
     * @see #setHeatRecoveryBoiler(HeatRecoveryBoiler)
     * @generated
     */
    boolean isSetHeatRecoveryBoiler();

    /**
     * Returns the value of the '<em><b>Air Compressor</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Air Compressor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Air Compressor</em>' reference.
     * @see #isSetAirCompressor()
     * @see #unsetAirCompressor()
     * @see #setAirCompressor(AirCompressor)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombustionTurbine_AirCompressor()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor#getCombustionTurbine
     * @model opposite="CombustionTurbine" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombustionTurbine.AirCompressor' kind='element'"
     * @generated
     */
    AirCompressor getAirCompressor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Air Compressor</em>' reference.
     * @see #isSetAirCompressor()
     * @see #unsetAirCompressor()
     * @see #getAirCompressor()
     * @generated
     */
    void setAirCompressor( AirCompressor value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAirCompressor()
     * @see #getAirCompressor()
     * @see #setAirCompressor(AirCompressor)
     * @generated
     */
    void unsetAirCompressor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Air Compressor</em>' reference is set.
     * @see #unsetAirCompressor()
     * @see #getAirCompressor()
     * @see #setAirCompressor(AirCompressor)
     * @generated
     */
    boolean isSetAirCompressor();

} // CombustionTurbine
