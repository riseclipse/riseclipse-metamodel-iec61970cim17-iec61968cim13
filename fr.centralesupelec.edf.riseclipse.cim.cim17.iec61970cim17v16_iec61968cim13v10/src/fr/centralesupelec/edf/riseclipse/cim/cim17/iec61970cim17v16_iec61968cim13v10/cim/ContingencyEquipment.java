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
 * A representation of the model object '<em><b>Contingency Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingencyEquipment()
 * @model
 * @generated
 */
public interface ContingencyEquipment extends ContingencyElement {
    /**
     * Returns the value of the '<em><b>Contingent Status</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipmentStatusKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contingent Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contingent Status</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipmentStatusKind
     * @see #isSetContingentStatus()
     * @see #unsetContingentStatus()
     * @see #setContingentStatus(ContingencyEquipmentStatusKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingencyEquipment_ContingentStatus()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ContingencyEquipment.contingentStatus' kind='element'"
     * @generated
     */
    ContingencyEquipmentStatusKind getContingentStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contingent Status</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipmentStatusKind
     * @see #isSetContingentStatus()
     * @see #unsetContingentStatus()
     * @see #getContingentStatus()
     * @generated
     */
    void setContingentStatus( ContingencyEquipmentStatusKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContingentStatus()
     * @see #getContingentStatus()
     * @see #setContingentStatus(ContingencyEquipmentStatusKind)
     * @generated
     */
    void unsetContingentStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getContingentStatus <em>Contingent Status</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contingent Status</em>' attribute is set.
     * @see #unsetContingentStatus()
     * @see #getContingentStatus()
     * @see #setContingentStatus(ContingencyEquipmentStatusKind)
     * @generated
     */
    boolean isSetContingentStatus();

    /**
     * Returns the value of the '<em><b>Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equipment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipment</em>' reference.
     * @see #isSetEquipment()
     * @see #unsetEquipment()
     * @see #setEquipment(Equipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingencyEquipment_Equipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getContingencyEquipment
     * @model opposite="ContingencyEquipment" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ContingencyEquipment.Equipment' kind='element'"
     * @generated
     */
    Equipment getEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment <em>Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equipment</em>' reference.
     * @see #isSetEquipment()
     * @see #unsetEquipment()
     * @see #getEquipment()
     * @generated
     */
    void setEquipment( Equipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment <em>Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipment()
     * @see #getEquipment()
     * @see #setEquipment(Equipment)
     * @generated
     */
    void unsetEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment <em>Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipment</em>' reference is set.
     * @see #unsetEquipment()
     * @see #getEquipment()
     * @see #setEquipment(Equipment)
     * @generated
     */
    boolean isSetEquipment();

} // ContingencyEquipment
