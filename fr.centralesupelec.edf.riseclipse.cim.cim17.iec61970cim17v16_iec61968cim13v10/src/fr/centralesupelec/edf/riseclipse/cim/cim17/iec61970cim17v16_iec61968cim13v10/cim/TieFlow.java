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
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTieFlow()
 * @model
 * @generated
 */
public interface TieFlow extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTieFlow_PositiveFlowIn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TieFlow.positiveFlowIn' kind='element'"
     * @generated
     */
    Boolean getPositiveFlowIn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive Flow In</em>' attribute.
     * @see #isSetPositiveFlowIn()
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @generated
     */
    void setPositiveFlowIn( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    void unsetPositiveFlowIn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive Flow In</em>' attribute is set.
     * @see #unsetPositiveFlowIn()
     * @see #getPositiveFlowIn()
     * @see #setPositiveFlowIn(Boolean)
     * @generated
     */
    boolean isSetPositiveFlowIn();

    /**
     * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas#getTieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alt Tie Meas</em>' reference list.
     * @see #isSetAltTieMeas()
     * @see #unsetAltTieMeas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTieFlow_AltTieMeas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas#getTieFlow
     * @model opposite="TieFlow" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TieFlow.AltTieMeas' kind='element'"
     * @generated
     */
    EList< AltTieMeas > getAltTieMeas();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAltTieMeas()
     * @see #getAltTieMeas()
     * @generated
     */
    void unsetAltTieMeas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alt Tie Meas</em>' reference list is set.
     * @see #unsetAltTieMeas()
     * @see #getAltTieMeas()
     * @generated
     */
    boolean isSetAltTieMeas();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTieFlow_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTieFlow
     * @model opposite="TieFlow" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TieFlow.Terminal' kind='element'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Control Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getTieFlow <em>Tie Flow</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Area</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #setControlArea(ControlArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTieFlow_ControlArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getTieFlow
     * @model opposite="TieFlow" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TieFlow.ControlArea' kind='element'"
     * @generated
     */
    ControlArea getControlArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area</em>' reference.
     * @see #isSetControlArea()
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @generated
     */
    void setControlArea( ControlArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    void unsetControlArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea <em>Control Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area</em>' reference is set.
     * @see #unsetControlArea()
     * @see #getControlArea()
     * @see #setControlArea(ControlArea)
     * @generated
     */
    boolean isSetControlArea();

} // TieFlow
