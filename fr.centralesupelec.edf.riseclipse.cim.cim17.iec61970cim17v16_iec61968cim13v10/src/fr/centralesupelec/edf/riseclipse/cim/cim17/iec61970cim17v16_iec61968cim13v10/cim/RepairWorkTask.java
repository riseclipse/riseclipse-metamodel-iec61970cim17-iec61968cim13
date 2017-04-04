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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repair Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getEmergency <em>Emergency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getBreakerRepairItem <em>Breaker Repair Item</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairWorkTask()
 * @model
 * @generated
 */
public interface RepairWorkTask extends WorkTask {
    /**
     * Returns the value of the '<em><b>Emergency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emergency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emergency</em>' attribute.
     * @see #isSetEmergency()
     * @see #unsetEmergency()
     * @see #setEmergency(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairWorkTask_Emergency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RepairWorkTask.emergency' kind='element'"
     * @generated
     */
    Boolean getEmergency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getEmergency <em>Emergency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emergency</em>' attribute.
     * @see #isSetEmergency()
     * @see #unsetEmergency()
     * @see #getEmergency()
     * @generated
     */
    void setEmergency( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getEmergency <em>Emergency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmergency()
     * @see #getEmergency()
     * @see #setEmergency(Boolean)
     * @generated
     */
    void unsetEmergency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getEmergency <em>Emergency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emergency</em>' attribute is set.
     * @see #unsetEmergency()
     * @see #getEmergency()
     * @see #setEmergency(Boolean)
     * @generated
     */
    boolean isSetEmergency();

    /**
     * Returns the value of the '<em><b>Breaker Repair Item</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getRepairWorkTask <em>Repair Work Task</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Repair Item</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Repair Item</em>' reference list.
     * @see #isSetBreakerRepairItem()
     * @see #unsetBreakerRepairItem()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairWorkTask_BreakerRepairItem()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getRepairWorkTask
     * @model opposite="RepairWorkTask" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RepairWorkTask.BreakerRepairItem' kind='element'"
     * @generated
     */
    EList< RepairItem > getBreakerRepairItem();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getBreakerRepairItem <em>Breaker Repair Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerRepairItem()
     * @see #getBreakerRepairItem()
     * @generated
     */
    void unsetBreakerRepairItem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getBreakerRepairItem <em>Breaker Repair Item</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Repair Item</em>' reference list is set.
     * @see #unsetBreakerRepairItem()
     * @see #getBreakerRepairItem()
     * @generated
     */
    boolean isSetBreakerRepairItem();

} // RepairWorkTask
