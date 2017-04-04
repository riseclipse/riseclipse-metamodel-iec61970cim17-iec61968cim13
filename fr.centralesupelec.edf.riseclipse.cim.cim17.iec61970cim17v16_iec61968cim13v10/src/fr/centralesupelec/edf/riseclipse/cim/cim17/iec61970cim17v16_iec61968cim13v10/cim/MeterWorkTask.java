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
 * A representation of the model object '<em><b>Meter Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getMeter <em>Meter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getOldMeter <em>Old Meter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterWorkTask()
 * @model
 * @generated
 */
public interface MeterWorkTask extends WorkTask {
    /**
     * Returns the value of the '<em><b>Meter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterServiceWorkTasks <em>Meter Service Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #setMeter(Meter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterWorkTask_Meter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterServiceWorkTasks
     * @model opposite="MeterServiceWorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterWorkTask.Meter' kind='element'"
     * @generated
     */
    Meter getMeter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #getMeter()
     * @generated
     */
    void setMeter( Meter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    void unsetMeter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getMeter <em>Meter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter</em>' reference is set.
     * @see #unsetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    boolean isSetMeter();

    /**
     * Returns the value of the '<em><b>Usage Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getMeterServiceWorkTasks <em>Meter Service Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterWorkTask_UsagePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getMeterServiceWorkTasks
     * @model opposite="MeterServiceWorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterWorkTask.UsagePoint' kind='element'"
     * @generated
     */
    UsagePoint getUsagePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @generated
     */
    void setUsagePoint( UsagePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    void unsetUsagePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getUsagePoint <em>Usage Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Point</em>' reference is set.
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    boolean isSetUsagePoint();

    /**
     * Returns the value of the '<em><b>Old Meter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterReplacementWorkTasks <em>Meter Replacement Work Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Meter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Meter</em>' reference.
     * @see #isSetOldMeter()
     * @see #unsetOldMeter()
     * @see #setOldMeter(Meter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterWorkTask_OldMeter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterReplacementWorkTasks
     * @model opposite="MeterReplacementWorkTasks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterWorkTask.OldMeter' kind='element'"
     * @generated
     */
    Meter getOldMeter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getOldMeter <em>Old Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Meter</em>' reference.
     * @see #isSetOldMeter()
     * @see #unsetOldMeter()
     * @see #getOldMeter()
     * @generated
     */
    void setOldMeter( Meter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getOldMeter <em>Old Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOldMeter()
     * @see #getOldMeter()
     * @see #setOldMeter(Meter)
     * @generated
     */
    void unsetOldMeter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask#getOldMeter <em>Old Meter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Old Meter</em>' reference is set.
     * @see #unsetOldMeter()
     * @see #getOldMeter()
     * @see #setOldMeter(Meter)
     * @generated
     */
    boolean isSetOldMeter();

} // MeterWorkTask
