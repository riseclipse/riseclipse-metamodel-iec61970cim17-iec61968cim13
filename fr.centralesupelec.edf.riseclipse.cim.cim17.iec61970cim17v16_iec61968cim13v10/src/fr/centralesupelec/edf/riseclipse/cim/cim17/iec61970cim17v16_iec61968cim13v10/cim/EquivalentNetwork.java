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
 * A representation of the model object '<em><b>Equivalent Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquivalentNetwork()
 * @model
 * @generated
 */
public interface EquivalentNetwork extends ConnectivityNodeContainer {
    /**
     * Returns the value of the '<em><b>Equivalent Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equivalent Equipments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equivalent Equipments</em>' reference list.
     * @see #isSetEquivalentEquipments()
     * @see #unsetEquivalentEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquivalentNetwork_EquivalentEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentEquipment#getEquivalentNetwork
     * @model opposite="EquivalentNetwork" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EquivalentNetwork.EquivalentEquipments' kind='element'"
     * @generated
     */
    EList< EquivalentEquipment > getEquivalentEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentEquipments()
     * @see #getEquivalentEquipments()
     * @generated
     */
    void unsetEquivalentEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Equipments</em>' reference list is set.
     * @see #unsetEquivalentEquipments()
     * @see #getEquivalentEquipments()
     * @generated
     */
    boolean isSetEquivalentEquipments();

} // EquivalentNetwork
