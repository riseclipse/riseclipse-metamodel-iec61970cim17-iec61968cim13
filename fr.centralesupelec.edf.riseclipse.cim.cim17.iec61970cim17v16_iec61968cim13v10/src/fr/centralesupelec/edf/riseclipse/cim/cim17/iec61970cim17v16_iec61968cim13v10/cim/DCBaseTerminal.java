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
 * A representation of the model object '<em><b>DC Base Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCBaseTerminal()
 * @model
 * @generated
 */
public interface DCBaseTerminal extends ACDCTerminal {
    /**
     * Returns the value of the '<em><b>DC Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTerminals <em>DC Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DC Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DC Node</em>' reference.
     * @see #isSetDCNode()
     * @see #unsetDCNode()
     * @see #setDCNode(DCNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCBaseTerminal_DCNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode#getDCTerminals
     * @model opposite="DCTerminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCBaseTerminal.DCNode' kind='element'"
     * @generated
     */
    DCNode getDCNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DC Node</em>' reference.
     * @see #isSetDCNode()
     * @see #unsetDCNode()
     * @see #getDCNode()
     * @generated
     */
    void setDCNode( DCNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCNode()
     * @see #getDCNode()
     * @see #setDCNode(DCNode)
     * @generated
     */
    void unsetDCNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCNode <em>DC Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Node</em>' reference is set.
     * @see #unsetDCNode()
     * @see #getDCNode()
     * @see #setDCNode(DCNode)
     * @generated
     */
    boolean isSetDCNode();

    /**
     * Returns the value of the '<em><b>DC Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTerminals <em>DC Terminals</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCBaseTerminal_DCTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode#getDCTerminals
     * @model opposite="DCTerminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCBaseTerminal.DCTopologicalNode' kind='element'"
     * @generated
     */
    DCTopologicalNode getDCTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    void unsetDCTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal#getDCTopologicalNode <em>DC Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Topological Node</em>' reference is set.
     * @see #unsetDCTopologicalNode()
     * @see #getDCTopologicalNode()
     * @see #setDCTopologicalNode(DCTopologicalNode)
     * @generated
     */
    boolean isSetDCTopologicalNode();

} // DCBaseTerminal
