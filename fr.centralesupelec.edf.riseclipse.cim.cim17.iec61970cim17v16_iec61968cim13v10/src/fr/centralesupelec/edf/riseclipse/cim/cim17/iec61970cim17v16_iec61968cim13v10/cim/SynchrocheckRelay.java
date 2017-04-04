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
 * A representation of the model object '<em><b>Synchrocheck Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchrocheckRelay()
 * @model
 * @generated
 */
public interface SynchrocheckRelay extends ProtectionEquipment {
    /**
     * Returns the value of the '<em><b>Max Angle Diff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Angle Diff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Angle Diff</em>' attribute.
     * @see #isSetMaxAngleDiff()
     * @see #unsetMaxAngleDiff()
     * @see #setMaxAngleDiff(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchrocheckRelay_MaxAngleDiff()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchrocheckRelay.maxAngleDiff' kind='element'"
     * @generated
     */
    Float getMaxAngleDiff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Angle Diff</em>' attribute.
     * @see #isSetMaxAngleDiff()
     * @see #unsetMaxAngleDiff()
     * @see #getMaxAngleDiff()
     * @generated
     */
    void setMaxAngleDiff( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxAngleDiff()
     * @see #getMaxAngleDiff()
     * @see #setMaxAngleDiff(Float)
     * @generated
     */
    void unsetMaxAngleDiff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Angle Diff</em>' attribute is set.
     * @see #unsetMaxAngleDiff()
     * @see #getMaxAngleDiff()
     * @see #setMaxAngleDiff(Float)
     * @generated
     */
    boolean isSetMaxAngleDiff();

    /**
     * Returns the value of the '<em><b>Max Freq Diff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Freq Diff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Freq Diff</em>' attribute.
     * @see #isSetMaxFreqDiff()
     * @see #unsetMaxFreqDiff()
     * @see #setMaxFreqDiff(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchrocheckRelay_MaxFreqDiff()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchrocheckRelay.maxFreqDiff' kind='element'"
     * @generated
     */
    Float getMaxFreqDiff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Freq Diff</em>' attribute.
     * @see #isSetMaxFreqDiff()
     * @see #unsetMaxFreqDiff()
     * @see #getMaxFreqDiff()
     * @generated
     */
    void setMaxFreqDiff( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxFreqDiff()
     * @see #getMaxFreqDiff()
     * @see #setMaxFreqDiff(Float)
     * @generated
     */
    void unsetMaxFreqDiff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Freq Diff</em>' attribute is set.
     * @see #unsetMaxFreqDiff()
     * @see #getMaxFreqDiff()
     * @see #setMaxFreqDiff(Float)
     * @generated
     */
    boolean isSetMaxFreqDiff();

    /**
     * Returns the value of the '<em><b>Max Volt Diff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Volt Diff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Volt Diff</em>' attribute.
     * @see #isSetMaxVoltDiff()
     * @see #unsetMaxVoltDiff()
     * @see #setMaxVoltDiff(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchrocheckRelay_MaxVoltDiff()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchrocheckRelay.maxVoltDiff' kind='element'"
     * @generated
     */
    Float getMaxVoltDiff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Volt Diff</em>' attribute.
     * @see #isSetMaxVoltDiff()
     * @see #unsetMaxVoltDiff()
     * @see #getMaxVoltDiff()
     * @generated
     */
    void setMaxVoltDiff( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxVoltDiff()
     * @see #getMaxVoltDiff()
     * @see #setMaxVoltDiff(Float)
     * @generated
     */
    void unsetMaxVoltDiff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Volt Diff</em>' attribute is set.
     * @see #unsetMaxVoltDiff()
     * @see #getMaxVoltDiff()
     * @see #setMaxVoltDiff(Float)
     * @generated
     */
    boolean isSetMaxVoltDiff();

} // SynchrocheckRelay
