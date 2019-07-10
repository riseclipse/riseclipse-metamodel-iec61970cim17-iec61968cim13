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
 * A representation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getGasWeightPerTank <em>Gas Weight Per Tank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsSinglePhase <em>Is Single Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsUnganged <em>Is Unganged</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureAlarm <em>Low Pressure Alarm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureLockOut <em>Low Pressure Lock Out</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getOilVolumePerTank <em>Oil Volume Per Tank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedFrequency <em>Rated Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedInterruptingTime <em>Rated Interrupting Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo()
 * @model
 * @generated
 */
public interface SwitchInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Breaking Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaking Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaking Capacity</em>' attribute.
     * @see #isSetBreakingCapacity()
     * @see #unsetBreakingCapacity()
     * @see #setBreakingCapacity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_BreakingCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.breakingCapacity' kind='element'"
     * @generated
     */
    Float getBreakingCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaking Capacity</em>' attribute.
     * @see #isSetBreakingCapacity()
     * @see #unsetBreakingCapacity()
     * @see #getBreakingCapacity()
     * @generated
     */
    void setBreakingCapacity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakingCapacity()
     * @see #getBreakingCapacity()
     * @see #setBreakingCapacity(Float)
     * @generated
     */
    void unsetBreakingCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getBreakingCapacity <em>Breaking Capacity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaking Capacity</em>' attribute is set.
     * @see #unsetBreakingCapacity()
     * @see #getBreakingCapacity()
     * @see #setBreakingCapacity(Float)
     * @generated
     */
    boolean isSetBreakingCapacity();

    /**
     * Returns the value of the '<em><b>Gas Weight Per Tank</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gas Weight Per Tank</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gas Weight Per Tank</em>' attribute.
     * @see #isSetGasWeightPerTank()
     * @see #unsetGasWeightPerTank()
     * @see #setGasWeightPerTank(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_GasWeightPerTank()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.gasWeightPerTank' kind='element'"
     * @generated
     */
    Float getGasWeightPerTank();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getGasWeightPerTank <em>Gas Weight Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gas Weight Per Tank</em>' attribute.
     * @see #isSetGasWeightPerTank()
     * @see #unsetGasWeightPerTank()
     * @see #getGasWeightPerTank()
     * @generated
     */
    void setGasWeightPerTank( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getGasWeightPerTank <em>Gas Weight Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGasWeightPerTank()
     * @see #getGasWeightPerTank()
     * @see #setGasWeightPerTank(Float)
     * @generated
     */
    void unsetGasWeightPerTank();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getGasWeightPerTank <em>Gas Weight Per Tank</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gas Weight Per Tank</em>' attribute is set.
     * @see #unsetGasWeightPerTank()
     * @see #getGasWeightPerTank()
     * @see #setGasWeightPerTank(Float)
     * @generated
     */
    boolean isSetGasWeightPerTank();

    /**
     * Returns the value of the '<em><b>Is Single Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Single Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Single Phase</em>' attribute.
     * @see #isSetIsSinglePhase()
     * @see #unsetIsSinglePhase()
     * @see #setIsSinglePhase(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_IsSinglePhase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.isSinglePhase' kind='element'"
     * @generated
     */
    Boolean getIsSinglePhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsSinglePhase <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Single Phase</em>' attribute.
     * @see #isSetIsSinglePhase()
     * @see #unsetIsSinglePhase()
     * @see #getIsSinglePhase()
     * @generated
     */
    void setIsSinglePhase( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsSinglePhase <em>Is Single Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSinglePhase()
     * @see #getIsSinglePhase()
     * @see #setIsSinglePhase(Boolean)
     * @generated
     */
    void unsetIsSinglePhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsSinglePhase <em>Is Single Phase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Single Phase</em>' attribute is set.
     * @see #unsetIsSinglePhase()
     * @see #getIsSinglePhase()
     * @see #setIsSinglePhase(Boolean)
     * @generated
     */
    boolean isSetIsSinglePhase();

    /**
     * Returns the value of the '<em><b>Is Unganged</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Unganged</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Unganged</em>' attribute.
     * @see #isSetIsUnganged()
     * @see #unsetIsUnganged()
     * @see #setIsUnganged(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_IsUnganged()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.isUnganged' kind='element'"
     * @generated
     */
    Boolean getIsUnganged();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsUnganged <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Unganged</em>' attribute.
     * @see #isSetIsUnganged()
     * @see #unsetIsUnganged()
     * @see #getIsUnganged()
     * @generated
     */
    void setIsUnganged( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsUnganged <em>Is Unganged</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsUnganged()
     * @see #getIsUnganged()
     * @see #setIsUnganged(Boolean)
     * @generated
     */
    void unsetIsUnganged();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getIsUnganged <em>Is Unganged</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Unganged</em>' attribute is set.
     * @see #unsetIsUnganged()
     * @see #getIsUnganged()
     * @see #setIsUnganged(Boolean)
     * @generated
     */
    boolean isSetIsUnganged();

    /**
     * Returns the value of the '<em><b>Low Pressure Alarm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Pressure Alarm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Pressure Alarm</em>' attribute.
     * @see #isSetLowPressureAlarm()
     * @see #unsetLowPressureAlarm()
     * @see #setLowPressureAlarm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_LowPressureAlarm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.lowPressureAlarm' kind='element'"
     * @generated
     */
    Float getLowPressureAlarm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureAlarm <em>Low Pressure Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Pressure Alarm</em>' attribute.
     * @see #isSetLowPressureAlarm()
     * @see #unsetLowPressureAlarm()
     * @see #getLowPressureAlarm()
     * @generated
     */
    void setLowPressureAlarm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureAlarm <em>Low Pressure Alarm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowPressureAlarm()
     * @see #getLowPressureAlarm()
     * @see #setLowPressureAlarm(Float)
     * @generated
     */
    void unsetLowPressureAlarm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureAlarm <em>Low Pressure Alarm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Pressure Alarm</em>' attribute is set.
     * @see #unsetLowPressureAlarm()
     * @see #getLowPressureAlarm()
     * @see #setLowPressureAlarm(Float)
     * @generated
     */
    boolean isSetLowPressureAlarm();

    /**
     * Returns the value of the '<em><b>Low Pressure Lock Out</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Pressure Lock Out</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Pressure Lock Out</em>' attribute.
     * @see #isSetLowPressureLockOut()
     * @see #unsetLowPressureLockOut()
     * @see #setLowPressureLockOut(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_LowPressureLockOut()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.lowPressureLockOut' kind='element'"
     * @generated
     */
    Float getLowPressureLockOut();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureLockOut <em>Low Pressure Lock Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Pressure Lock Out</em>' attribute.
     * @see #isSetLowPressureLockOut()
     * @see #unsetLowPressureLockOut()
     * @see #getLowPressureLockOut()
     * @generated
     */
    void setLowPressureLockOut( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureLockOut <em>Low Pressure Lock Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowPressureLockOut()
     * @see #getLowPressureLockOut()
     * @see #setLowPressureLockOut(Float)
     * @generated
     */
    void unsetLowPressureLockOut();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getLowPressureLockOut <em>Low Pressure Lock Out</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Pressure Lock Out</em>' attribute is set.
     * @see #unsetLowPressureLockOut()
     * @see #getLowPressureLockOut()
     * @see #setLowPressureLockOut(Float)
     * @generated
     */
    boolean isSetLowPressureLockOut();

    /**
     * Returns the value of the '<em><b>Oil Volume Per Tank</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Oil Volume Per Tank</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Oil Volume Per Tank</em>' attribute.
     * @see #isSetOilVolumePerTank()
     * @see #unsetOilVolumePerTank()
     * @see #setOilVolumePerTank(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_OilVolumePerTank()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.oilVolumePerTank' kind='element'"
     * @generated
     */
    Float getOilVolumePerTank();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getOilVolumePerTank <em>Oil Volume Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oil Volume Per Tank</em>' attribute.
     * @see #isSetOilVolumePerTank()
     * @see #unsetOilVolumePerTank()
     * @see #getOilVolumePerTank()
     * @generated
     */
    void setOilVolumePerTank( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getOilVolumePerTank <em>Oil Volume Per Tank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOilVolumePerTank()
     * @see #getOilVolumePerTank()
     * @see #setOilVolumePerTank(Float)
     * @generated
     */
    void unsetOilVolumePerTank();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getOilVolumePerTank <em>Oil Volume Per Tank</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Oil Volume Per Tank</em>' attribute is set.
     * @see #unsetOilVolumePerTank()
     * @see #getOilVolumePerTank()
     * @see #setOilVolumePerTank(Float)
     * @generated
     */
    boolean isSetOilVolumePerTank();

    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Rated Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Frequency</em>' attribute.
     * @see #isSetRatedFrequency()
     * @see #unsetRatedFrequency()
     * @see #setRatedFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_RatedFrequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.ratedFrequency' kind='element'"
     * @generated
     */
    Float getRatedFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedFrequency <em>Rated Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Frequency</em>' attribute.
     * @see #isSetRatedFrequency()
     * @see #unsetRatedFrequency()
     * @see #getRatedFrequency()
     * @generated
     */
    void setRatedFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedFrequency <em>Rated Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedFrequency()
     * @see #getRatedFrequency()
     * @see #setRatedFrequency(Float)
     * @generated
     */
    void unsetRatedFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedFrequency <em>Rated Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Frequency</em>' attribute is set.
     * @see #unsetRatedFrequency()
     * @see #getRatedFrequency()
     * @see #setRatedFrequency(Float)
     * @generated
     */
    boolean isSetRatedFrequency();

    /**
     * Returns the value of the '<em><b>Rated Impulse Withstand Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Impulse Withstand Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Impulse Withstand Voltage</em>' attribute.
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_RatedImpulseWithstandVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.ratedImpulseWithstandVoltage' kind='element'"
     * @generated
     */
    Float getRatedImpulseWithstandVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Impulse Withstand Voltage</em>' attribute.
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     */
    void setRatedImpulseWithstandVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @generated
     */
    void unsetRatedImpulseWithstandVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Impulse Withstand Voltage</em>' attribute is set.
     * @see #unsetRatedImpulseWithstandVoltage()
     * @see #getRatedImpulseWithstandVoltage()
     * @see #setRatedImpulseWithstandVoltage(Float)
     * @generated
     */
    boolean isSetRatedImpulseWithstandVoltage();

    /**
     * Returns the value of the '<em><b>Rated Interrupting Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Interrupting Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Interrupting Time</em>' attribute.
     * @see #isSetRatedInterruptingTime()
     * @see #unsetRatedInterruptingTime()
     * @see #setRatedInterruptingTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_RatedInterruptingTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.ratedInterruptingTime' kind='element'"
     * @generated
     */
    Float getRatedInterruptingTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedInterruptingTime <em>Rated Interrupting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Interrupting Time</em>' attribute.
     * @see #isSetRatedInterruptingTime()
     * @see #unsetRatedInterruptingTime()
     * @see #getRatedInterruptingTime()
     * @generated
     */
    void setRatedInterruptingTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedInterruptingTime <em>Rated Interrupting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedInterruptingTime()
     * @see #getRatedInterruptingTime()
     * @see #setRatedInterruptingTime(Float)
     * @generated
     */
    void unsetRatedInterruptingTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedInterruptingTime <em>Rated Interrupting Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Interrupting Time</em>' attribute is set.
     * @see #unsetRatedInterruptingTime()
     * @see #getRatedInterruptingTime()
     * @see #setRatedInterruptingTime(Float)
     * @generated
     */
    boolean isSetRatedInterruptingTime();

    /**
     * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchInfo_RatedVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchInfo.ratedVoltage' kind='element'"
     * @generated
     */
    Float getRatedVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @generated
     */
    void setRatedVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    void unsetRatedVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    boolean isSetRatedVoltage();

} // SwitchInfo
