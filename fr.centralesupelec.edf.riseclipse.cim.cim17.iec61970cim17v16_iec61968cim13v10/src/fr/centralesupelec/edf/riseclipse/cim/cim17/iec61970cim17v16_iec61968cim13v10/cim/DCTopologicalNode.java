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
 * A representation of the model object '<em><b>DC Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTopologicalNode()
 * @model
 * @generated
 */
public interface DCTopologicalNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DC Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Nodes</em>' reference list.
     * @see #isSetDCNodes()
     * @see #unsetDCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTopologicalNode_DCNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCTopologicalNode.DCNodes' kind='element'"
     * @generated
     */
    EList< DCNode > getDCNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    void unsetDCNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Nodes</em>' reference list is set.
     * @see #unsetDCNodes()
     * @see #getDCNodes()
     * @generated
     */
    boolean isSetDCNodes();

    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Terminals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTopologicalNode_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCTopologicalNode.DCTerminals' kind='element'"
     * @generated
     */
    EList< DCBaseTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

    /**
     * Returns the value of the '<em><b>DC Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalIsland#getDCTopologicalNodes <em>DC Topological Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Topological Island</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Topological Island</em>' reference.
     * @see #isSetDCTopologicalIsland()
     * @see #unsetDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTopologicalNode_DCTopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalIsland#getDCTopologicalNodes
     * @model opposite="DCTopologicalNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCTopologicalNode.DCTopologicalIsland' kind='element'"
     * @generated
     */
    DCTopologicalIsland getDCTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Topological Island</em>' reference.
     * @see #isSetDCTopologicalIsland()
     * @see #unsetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @generated
     */
    void setDCTopologicalIsland( DCTopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @generated
     */
    void unsetDCTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTopologicalIsland <em>DC Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Island</em>' reference is set.
     * @see #unsetDCTopologicalIsland()
     * @see #getDCTopologicalIsland()
     * @see #setDCTopologicalIsland(DCTopologicalIsland)
     * @generated
     */
    boolean isSetDCTopologicalIsland();

    /**
     * Returns the value of the '<em><b>DC Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer#getDCTopologicalNode <em>DC Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Equipment Container</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Equipment Container</em>' reference.
     * @see #isSetDCEquipmentContainer()
     * @see #unsetDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCTopologicalNode_DCEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer#getDCTopologicalNode
     * @model opposite="DCTopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCTopologicalNode.DCEquipmentContainer' kind='element'"
     * @generated
     */
    DCEquipmentContainer getDCEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Equipment Container</em>' reference.
     * @see #isSetDCEquipmentContainer()
     * @see #unsetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @generated
     */
    void setDCEquipmentContainer( DCEquipmentContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    void unsetDCEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Equipment Container</em>' reference is set.
     * @see #unsetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    boolean isSetDCEquipmentContainer();

} // DCTopologicalNode
