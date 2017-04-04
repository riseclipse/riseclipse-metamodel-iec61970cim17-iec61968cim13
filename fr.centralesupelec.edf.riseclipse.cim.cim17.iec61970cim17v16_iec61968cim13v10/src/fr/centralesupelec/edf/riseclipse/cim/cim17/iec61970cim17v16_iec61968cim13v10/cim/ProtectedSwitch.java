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
 * A representation of the model object '<em><b>Protected Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getOperatedByProtectionEquipment <em>Operated By Protection Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectedSwitch()
 * @model
 * @generated
 */
public interface ProtectedSwitch extends Switch {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectedSwitch_BreakingCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectedSwitch.breakingCapacity' kind='element'"
     * @generated
     */
    Float getBreakingCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakingCapacity()
     * @see #getBreakingCapacity()
     * @see #setBreakingCapacity(Float)
     * @generated
     */
    void unsetBreakingCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getBreakingCapacity <em>Breaking Capacity</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Reclose Sequences</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reclose Sequences</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reclose Sequences</em>' reference list.
     * @see #isSetRecloseSequences()
     * @see #unsetRecloseSequences()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectedSwitch_RecloseSequences()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch
     * @model opposite="ProtectedSwitch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectedSwitch.RecloseSequences' kind='element'"
     * @generated
     */
    EList< RecloseSequence > getRecloseSequences();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecloseSequences()
     * @see #getRecloseSequences()
     * @generated
     */
    void unsetRecloseSequences();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reclose Sequences</em>' reference list is set.
     * @see #unsetRecloseSequences()
     * @see #getRecloseSequences()
     * @generated
     */
    boolean isSetRecloseSequences();

    /**
     * Returns the value of the '<em><b>Operated By Protection Equipment</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operated By Protection Equipment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operated By Protection Equipment</em>' reference list.
     * @see #isSetOperatedByProtectionEquipment()
     * @see #unsetOperatedByProtectionEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectedSwitch_OperatedByProtectionEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getProtectedSwitches
     * @model opposite="ProtectedSwitches" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectedSwitch.OperatedByProtectionEquipment' kind='element'"
     * @generated
     */
    EList< ProtectionEquipment > getOperatedByProtectionEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getOperatedByProtectionEquipment <em>Operated By Protection Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatedByProtectionEquipment()
     * @see #getOperatedByProtectionEquipment()
     * @generated
     */
    void unsetOperatedByProtectionEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getOperatedByProtectionEquipment <em>Operated By Protection Equipment</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operated By Protection Equipment</em>' reference list is set.
     * @see #unsetOperatedByProtectionEquipment()
     * @see #getOperatedByProtectionEquipment()
     * @generated
     */
    boolean isSetOperatedByProtectionEquipment();

} // ProtectedSwitch
