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
 * A representation of the model object '<em><b>Switch Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getClosed <em>Closed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase()
 * @model
 * @generated
 */
public interface SwitchPhase extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Closed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Closed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Closed</em>' attribute.
     * @see #isSetClosed()
     * @see #unsetClosed()
     * @see #setClosed(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase_Closed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchPhase.closed' kind='element'"
     * @generated
     */
    Boolean getClosed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getClosed <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Closed</em>' attribute.
     * @see #isSetClosed()
     * @see #unsetClosed()
     * @see #getClosed()
     * @generated
     */
    void setClosed( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getClosed <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClosed()
     * @see #getClosed()
     * @see #setClosed(Boolean)
     * @generated
     */
    void unsetClosed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getClosed <em>Closed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Closed</em>' attribute is set.
     * @see #unsetClosed()
     * @see #getClosed()
     * @see #setClosed(Boolean)
     * @generated
     */
    boolean isSetClosed();

    /**
     * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase_NormalOpen()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchPhase.normalOpen' kind='element'"
     * @generated
     */
    Boolean getNormalOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @generated
     */
    void setNormalOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    void unsetNormalOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getNormalOpen <em>Normal Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Open</em>' attribute is set.
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    boolean isSetNormalOpen();

    /**
     * Returns the value of the '<em><b>Phase Side1</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Side1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Side1</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseSide1()
     * @see #unsetPhaseSide1()
     * @see #setPhaseSide1(SinglePhaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase_PhaseSide1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchPhase.phaseSide1' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhaseSide1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Side1</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseSide1()
     * @see #unsetPhaseSide1()
     * @see #getPhaseSide1()
     * @generated
     */
    void setPhaseSide1( SinglePhaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseSide1()
     * @see #getPhaseSide1()
     * @see #setPhaseSide1(SinglePhaseKind)
     * @generated
     */
    void unsetPhaseSide1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Side1</em>' attribute is set.
     * @see #unsetPhaseSide1()
     * @see #getPhaseSide1()
     * @see #setPhaseSide1(SinglePhaseKind)
     * @generated
     */
    boolean isSetPhaseSide1();

    /**
     * Returns the value of the '<em><b>Phase Side2</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Side2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Side2</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseSide2()
     * @see #unsetPhaseSide2()
     * @see #setPhaseSide2(SinglePhaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase_PhaseSide2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchPhase.phaseSide2' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhaseSide2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Side2</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseSide2()
     * @see #unsetPhaseSide2()
     * @see #getPhaseSide2()
     * @generated
     */
    void setPhaseSide2( SinglePhaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseSide2()
     * @see #getPhaseSide2()
     * @see #setPhaseSide2(SinglePhaseKind)
     * @generated
     */
    void unsetPhaseSide2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Side2</em>' attribute is set.
     * @see #unsetPhaseSide2()
     * @see #getPhaseSide2()
     * @see #setPhaseSide2(SinglePhaseKind)
     * @generated
     */
    boolean isSetPhaseSide2();

    /**
     * Returns the value of the '<em><b>Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchPhase <em>Switch Phase</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #setSwitch(Switch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchPhase_Switch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchPhase
     * @model opposite="SwitchPhase" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchPhase.Switch' kind='element'"
     * @generated
     */
    Switch getSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @generated
     */
    void setSwitch( Switch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    void unsetSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch <em>Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch</em>' reference is set.
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    boolean isSetSwitch();

} // SwitchPhase
