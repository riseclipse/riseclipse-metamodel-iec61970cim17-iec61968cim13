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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Demand Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAvgLoadAdjustment <em>Avg Load Adjustment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelControlMode <em>Cancel Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelDateTime <em>Cancel Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelNow <em>Cancel Now</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingOffset <em>Cooling Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingSetpoint <em>Cooling Setpoint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getDutyCycle <em>Duty Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getEnrollmentGroup <em>Enrollment Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingOffset <em>Heating Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingSetpoint <em>Heating Setpoint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAppliance <em>Appliance</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse()
 * @model
 * @generated
 */
public interface PanDemandResponse extends EndDeviceAction {
    /**
     * Returns the value of the '<em><b>Avg Load Adjustment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg Load Adjustment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg Load Adjustment</em>' attribute.
     * @see #isSetAvgLoadAdjustment()
     * @see #unsetAvgLoadAdjustment()
     * @see #setAvgLoadAdjustment(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_AvgLoadAdjustment()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.avgLoadAdjustment' kind='element'"
     * @generated
     */
    Float getAvgLoadAdjustment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAvgLoadAdjustment <em>Avg Load Adjustment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg Load Adjustment</em>' attribute.
     * @see #isSetAvgLoadAdjustment()
     * @see #unsetAvgLoadAdjustment()
     * @see #getAvgLoadAdjustment()
     * @generated
     */
    void setAvgLoadAdjustment( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAvgLoadAdjustment <em>Avg Load Adjustment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAvgLoadAdjustment()
     * @see #getAvgLoadAdjustment()
     * @see #setAvgLoadAdjustment(Float)
     * @generated
     */
    void unsetAvgLoadAdjustment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAvgLoadAdjustment <em>Avg Load Adjustment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Avg Load Adjustment</em>' attribute is set.
     * @see #unsetAvgLoadAdjustment()
     * @see #getAvgLoadAdjustment()
     * @see #setAvgLoadAdjustment(Float)
     * @generated
     */
    boolean isSetAvgLoadAdjustment();

    /**
     * Returns the value of the '<em><b>Cancel Control Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Control Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Control Mode</em>' attribute.
     * @see #isSetCancelControlMode()
     * @see #unsetCancelControlMode()
     * @see #setCancelControlMode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CancelControlMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.cancelControlMode' kind='element'"
     * @generated
     */
    String getCancelControlMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelControlMode <em>Cancel Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Control Mode</em>' attribute.
     * @see #isSetCancelControlMode()
     * @see #unsetCancelControlMode()
     * @see #getCancelControlMode()
     * @generated
     */
    void setCancelControlMode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelControlMode <em>Cancel Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelControlMode()
     * @see #getCancelControlMode()
     * @see #setCancelControlMode(String)
     * @generated
     */
    void unsetCancelControlMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelControlMode <em>Cancel Control Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Control Mode</em>' attribute is set.
     * @see #unsetCancelControlMode()
     * @see #getCancelControlMode()
     * @see #setCancelControlMode(String)
     * @generated
     */
    boolean isSetCancelControlMode();

    /**
     * Returns the value of the '<em><b>Cancel Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Date Time</em>' attribute.
     * @see #isSetCancelDateTime()
     * @see #unsetCancelDateTime()
     * @see #setCancelDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CancelDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.cancelDateTime' kind='element'"
     * @generated
     */
    Date getCancelDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelDateTime <em>Cancel Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Date Time</em>' attribute.
     * @see #isSetCancelDateTime()
     * @see #unsetCancelDateTime()
     * @see #getCancelDateTime()
     * @generated
     */
    void setCancelDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelDateTime <em>Cancel Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelDateTime()
     * @see #getCancelDateTime()
     * @see #setCancelDateTime(Date)
     * @generated
     */
    void unsetCancelDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelDateTime <em>Cancel Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Date Time</em>' attribute is set.
     * @see #unsetCancelDateTime()
     * @see #getCancelDateTime()
     * @see #setCancelDateTime(Date)
     * @generated
     */
    boolean isSetCancelDateTime();

    /**
     * Returns the value of the '<em><b>Cancel Now</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cancel Now</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cancel Now</em>' attribute.
     * @see #isSetCancelNow()
     * @see #unsetCancelNow()
     * @see #setCancelNow(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CancelNow()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.cancelNow' kind='element'"
     * @generated
     */
    Boolean getCancelNow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelNow <em>Cancel Now</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancel Now</em>' attribute.
     * @see #isSetCancelNow()
     * @see #unsetCancelNow()
     * @see #getCancelNow()
     * @generated
     */
    void setCancelNow( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelNow <em>Cancel Now</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCancelNow()
     * @see #getCancelNow()
     * @see #setCancelNow(Boolean)
     * @generated
     */
    void unsetCancelNow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCancelNow <em>Cancel Now</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cancel Now</em>' attribute is set.
     * @see #unsetCancelNow()
     * @see #getCancelNow()
     * @see #setCancelNow(Boolean)
     * @generated
     */
    boolean isSetCancelNow();

    /**
     * Returns the value of the '<em><b>Cooling Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cooling Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cooling Offset</em>' attribute.
     * @see #isSetCoolingOffset()
     * @see #unsetCoolingOffset()
     * @see #setCoolingOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CoolingOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.coolingOffset' kind='element'"
     * @generated
     */
    Float getCoolingOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingOffset <em>Cooling Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cooling Offset</em>' attribute.
     * @see #isSetCoolingOffset()
     * @see #unsetCoolingOffset()
     * @see #getCoolingOffset()
     * @generated
     */
    void setCoolingOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingOffset <em>Cooling Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoolingOffset()
     * @see #getCoolingOffset()
     * @see #setCoolingOffset(Float)
     * @generated
     */
    void unsetCoolingOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingOffset <em>Cooling Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cooling Offset</em>' attribute is set.
     * @see #unsetCoolingOffset()
     * @see #getCoolingOffset()
     * @see #setCoolingOffset(Float)
     * @generated
     */
    boolean isSetCoolingOffset();

    /**
     * Returns the value of the '<em><b>Cooling Setpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cooling Setpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cooling Setpoint</em>' attribute.
     * @see #isSetCoolingSetpoint()
     * @see #unsetCoolingSetpoint()
     * @see #setCoolingSetpoint(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CoolingSetpoint()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.coolingSetpoint' kind='element'"
     * @generated
     */
    Float getCoolingSetpoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingSetpoint <em>Cooling Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cooling Setpoint</em>' attribute.
     * @see #isSetCoolingSetpoint()
     * @see #unsetCoolingSetpoint()
     * @see #getCoolingSetpoint()
     * @generated
     */
    void setCoolingSetpoint( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingSetpoint <em>Cooling Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoolingSetpoint()
     * @see #getCoolingSetpoint()
     * @see #setCoolingSetpoint(Float)
     * @generated
     */
    void unsetCoolingSetpoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCoolingSetpoint <em>Cooling Setpoint</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cooling Setpoint</em>' attribute is set.
     * @see #unsetCoolingSetpoint()
     * @see #getCoolingSetpoint()
     * @see #setCoolingSetpoint(Float)
     * @generated
     */
    boolean isSetCoolingSetpoint();

    /**
     * Returns the value of the '<em><b>Criticality Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Criticality Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Criticality Level</em>' attribute.
     * @see #isSetCriticalityLevel()
     * @see #unsetCriticalityLevel()
     * @see #setCriticalityLevel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_CriticalityLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.criticalityLevel' kind='element'"
     * @generated
     */
    String getCriticalityLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCriticalityLevel <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Criticality Level</em>' attribute.
     * @see #isSetCriticalityLevel()
     * @see #unsetCriticalityLevel()
     * @see #getCriticalityLevel()
     * @generated
     */
    void setCriticalityLevel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCriticalityLevel <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCriticalityLevel()
     * @see #getCriticalityLevel()
     * @see #setCriticalityLevel(String)
     * @generated
     */
    void unsetCriticalityLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getCriticalityLevel <em>Criticality Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Criticality Level</em>' attribute is set.
     * @see #unsetCriticalityLevel()
     * @see #getCriticalityLevel()
     * @see #setCriticalityLevel(String)
     * @generated
     */
    boolean isSetCriticalityLevel();

    /**
     * Returns the value of the '<em><b>Duty Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duty Cycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duty Cycle</em>' attribute.
     * @see #isSetDutyCycle()
     * @see #unsetDutyCycle()
     * @see #setDutyCycle(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_DutyCycle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.dutyCycle' kind='element'"
     * @generated
     */
    Float getDutyCycle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getDutyCycle <em>Duty Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duty Cycle</em>' attribute.
     * @see #isSetDutyCycle()
     * @see #unsetDutyCycle()
     * @see #getDutyCycle()
     * @generated
     */
    void setDutyCycle( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getDutyCycle <em>Duty Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDutyCycle()
     * @see #getDutyCycle()
     * @see #setDutyCycle(Float)
     * @generated
     */
    void unsetDutyCycle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getDutyCycle <em>Duty Cycle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duty Cycle</em>' attribute is set.
     * @see #unsetDutyCycle()
     * @see #getDutyCycle()
     * @see #setDutyCycle(Float)
     * @generated
     */
    boolean isSetDutyCycle();

    /**
     * Returns the value of the '<em><b>Enrollment Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enrollment Group</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enrollment Group</em>' attribute.
     * @see #isSetEnrollmentGroup()
     * @see #unsetEnrollmentGroup()
     * @see #setEnrollmentGroup(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_EnrollmentGroup()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.enrollmentGroup' kind='element'"
     * @generated
     */
    String getEnrollmentGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getEnrollmentGroup <em>Enrollment Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enrollment Group</em>' attribute.
     * @see #isSetEnrollmentGroup()
     * @see #unsetEnrollmentGroup()
     * @see #getEnrollmentGroup()
     * @generated
     */
    void setEnrollmentGroup( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getEnrollmentGroup <em>Enrollment Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnrollmentGroup()
     * @see #getEnrollmentGroup()
     * @see #setEnrollmentGroup(String)
     * @generated
     */
    void unsetEnrollmentGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getEnrollmentGroup <em>Enrollment Group</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enrollment Group</em>' attribute is set.
     * @see #unsetEnrollmentGroup()
     * @see #getEnrollmentGroup()
     * @see #setEnrollmentGroup(String)
     * @generated
     */
    boolean isSetEnrollmentGroup();

    /**
     * Returns the value of the '<em><b>Heating Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heating Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heating Offset</em>' attribute.
     * @see #isSetHeatingOffset()
     * @see #unsetHeatingOffset()
     * @see #setHeatingOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_HeatingOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.heatingOffset' kind='element'"
     * @generated
     */
    Float getHeatingOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingOffset <em>Heating Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heating Offset</em>' attribute.
     * @see #isSetHeatingOffset()
     * @see #unsetHeatingOffset()
     * @see #getHeatingOffset()
     * @generated
     */
    void setHeatingOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingOffset <em>Heating Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatingOffset()
     * @see #getHeatingOffset()
     * @see #setHeatingOffset(Float)
     * @generated
     */
    void unsetHeatingOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingOffset <em>Heating Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heating Offset</em>' attribute is set.
     * @see #unsetHeatingOffset()
     * @see #getHeatingOffset()
     * @see #setHeatingOffset(Float)
     * @generated
     */
    boolean isSetHeatingOffset();

    /**
     * Returns the value of the '<em><b>Heating Setpoint</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heating Setpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heating Setpoint</em>' attribute.
     * @see #isSetHeatingSetpoint()
     * @see #unsetHeatingSetpoint()
     * @see #setHeatingSetpoint(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_HeatingSetpoint()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.heatingSetpoint' kind='element'"
     * @generated
     */
    Float getHeatingSetpoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingSetpoint <em>Heating Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heating Setpoint</em>' attribute.
     * @see #isSetHeatingSetpoint()
     * @see #unsetHeatingSetpoint()
     * @see #getHeatingSetpoint()
     * @generated
     */
    void setHeatingSetpoint( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingSetpoint <em>Heating Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatingSetpoint()
     * @see #getHeatingSetpoint()
     * @see #setHeatingSetpoint(Float)
     * @generated
     */
    void unsetHeatingSetpoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getHeatingSetpoint <em>Heating Setpoint</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heating Setpoint</em>' attribute is set.
     * @see #unsetHeatingSetpoint()
     * @see #getHeatingSetpoint()
     * @see #setHeatingSetpoint(Float)
     * @generated
     */
    boolean isSetHeatingSetpoint();

    /**
     * Returns the value of the '<em><b>Appliance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Appliance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Appliance</em>' containment reference.
     * @see #isSetAppliance()
     * @see #unsetAppliance()
     * @see #setAppliance(ControlledAppliance)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanDemandResponse_Appliance()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanDemandResponse.appliance' kind='element'"
     * @generated
     */
    ControlledAppliance getAppliance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAppliance <em>Appliance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Appliance</em>' containment reference.
     * @see #isSetAppliance()
     * @see #unsetAppliance()
     * @see #getAppliance()
     * @generated
     */
    void setAppliance( ControlledAppliance value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAppliance <em>Appliance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppliance()
     * @see #getAppliance()
     * @see #setAppliance(ControlledAppliance)
     * @generated
     */
    void unsetAppliance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse#getAppliance <em>Appliance</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Appliance</em>' containment reference is set.
     * @see #unsetAppliance()
     * @see #getAppliance()
     * @see #setAppliance(ControlledAppliance)
     * @generated
     */
    boolean isSetAppliance();

} // PanDemandResponse
