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
 * A representation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalIsland()
 * @model
 * @generated
 */
public interface TopologicalIsland extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Angle Ref Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle Ref Topological Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle Ref Topological Node</em>' reference.
     * @see #isSetAngleRefTopologicalNode()
     * @see #unsetAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalIsland_AngleRefTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland
     * @model opposite="AngleRefTopologicalIsland" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalIsland.AngleRefTopologicalNode' kind='element'"
     * @generated
     */
    TopologicalNode getAngleRefTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Ref Topological Node</em>' reference.
     * @see #isSetAngleRefTopologicalNode()
     * @see #unsetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @generated
     */
    void setAngleRefTopologicalNode( TopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetAngleRefTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle Ref Topological Node</em>' reference is set.
     * @see #unsetAngleRefTopologicalNode()
     * @see #getAngleRefTopologicalNode()
     * @see #setAngleRefTopologicalNode(TopologicalNode)
     * @generated
     */
    boolean isSetAngleRefTopologicalNode();

    /**
     * Returns the value of the '<em><b>Topological Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topological Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topological Nodes</em>' reference list.
     * @see #isSetTopologicalNodes()
     * @see #unsetTopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalIsland_TopologicalNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland
     * @model opposite="TopologicalIsland" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalIsland.TopologicalNodes' kind='element'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNodes()
     * @see #getTopologicalNodes()
     * @generated
     */
    void unsetTopologicalNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Nodes</em>' reference list is set.
     * @see #unsetTopologicalNodes()
     * @see #getTopologicalNodes()
     * @generated
     */
    boolean isSetTopologicalNodes();

} // TopologicalIsland
