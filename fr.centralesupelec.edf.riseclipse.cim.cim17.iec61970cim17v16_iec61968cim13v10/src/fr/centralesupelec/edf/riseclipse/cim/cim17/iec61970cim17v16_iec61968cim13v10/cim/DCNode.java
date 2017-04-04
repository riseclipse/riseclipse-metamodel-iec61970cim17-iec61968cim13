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
 * A representation of the model object '<em><b>DC Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCNode()
 * @model
 * @generated
 */
public interface DCNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DC Terminals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Terminals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Terminals</em>' reference list.
     * @see #isSetDCTerminals()
     * @see #unsetDCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCNode_DCTerminals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode
     * @model opposite="DCNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCNode.DCTerminals' kind='element'"
     * @generated
     */
    EList< DCBaseTerminal > getDCTerminals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTerminals <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    void unsetDCTerminals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTerminals <em>DC Terminals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Terminals</em>' reference list is set.
     * @see #unsetDCTerminals()
     * @see #getDCTerminals()
     * @generated
     */
    boolean isSetDCTerminals();

    /**
     * Returns the value of the '<em><b>DC Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCNodes <em>DC Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Topological Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Topological Node</em>' reference.
     * @see #isSetDCTopologicalNode()
     * @see #unsetDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCNode_DCTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCNodes
     * @model opposite="DCNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCNode.DCTopologicalNode' kind='element'"
     * @generated
     */
    DCTopologicalNode getDCTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Topological Node</em>' reference.
     * @see #isSetDCTopologicalNode()
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @generated
     */
    void setDCTopologicalNode( DCTopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    void unsetDCTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTopologicalNode <em>DC Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Node</em>' reference is set.
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    boolean isSetDCTopologicalNode();

    /**
     * Returns the value of the '<em><b>DC Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer#getDCNodes <em>DC Nodes</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCNode_DCEquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer#getDCNodes
     * @model opposite="DCNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCNode.DCEquipmentContainer' kind='element'"
     * @generated
     */
    DCEquipmentContainer getDCEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    void unsetDCEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCEquipmentContainer <em>DC Equipment Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Equipment Container</em>' reference is set.
     * @see #unsetDCEquipmentContainer()
     * @see #getDCEquipmentContainer()
     * @see #setDCEquipmentContainer(DCEquipmentContainer)
     * @generated
     */
    boolean isSetDCEquipmentContainer();

} // DCNode
