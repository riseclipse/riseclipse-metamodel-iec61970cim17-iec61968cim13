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
 * A representation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getPTolerance <em>PTolerance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea()
 * @model
 * @generated
 */
public interface ControlArea extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Net Interchange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Net Interchange</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Net Interchange</em>' attribute.
     * @see #isSetNetInterchange()
     * @see #unsetNetInterchange()
     * @see #setNetInterchange(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_NetInterchange()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.netInterchange' kind='element'"
     * @generated
     */
    Float getNetInterchange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Net Interchange</em>' attribute.
     * @see #isSetNetInterchange()
     * @see #unsetNetInterchange()
     * @see #getNetInterchange()
     * @generated
     */
    void setNetInterchange( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNetInterchange()
     * @see #getNetInterchange()
     * @see #setNetInterchange(Float)
     * @generated
     */
    void unsetNetInterchange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Net Interchange</em>' attribute is set.
     * @see #unsetNetInterchange()
     * @see #getNetInterchange()
     * @see #setNetInterchange(Float)
     * @generated
     */
    boolean isSetNetInterchange();

    /**
     * Returns the value of the '<em><b>PTolerance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PTolerance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PTolerance</em>' attribute.
     * @see #isSetPTolerance()
     * @see #unsetPTolerance()
     * @see #setPTolerance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_PTolerance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.pTolerance' kind='element'"
     * @generated
     */
    Float getPTolerance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PTolerance</em>' attribute.
     * @see #isSetPTolerance()
     * @see #unsetPTolerance()
     * @see #getPTolerance()
     * @generated
     */
    void setPTolerance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPTolerance()
     * @see #getPTolerance()
     * @see #setPTolerance(Float)
     * @generated
     */
    void unsetPTolerance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PTolerance</em>' attribute is set.
     * @see #unsetPTolerance()
     * @see #getPTolerance()
     * @see #setPTolerance(Float)
     * @generated
     */
    boolean isSetPTolerance();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaTypeKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(ControlAreaTypeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.type' kind='element'"
     * @generated
     */
    ControlAreaTypeKind getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaTypeKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( ControlAreaTypeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(ControlAreaTypeKind)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(ControlAreaTypeKind)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Energy Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Area</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Area</em>' reference.
     * @see #isSetEnergyArea()
     * @see #unsetEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_EnergyArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyArea#getControlArea
     * @model opposite="ControlArea" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.EnergyArea' kind='element'"
     * @generated
     */
    EnergyArea getEnergyArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Area</em>' reference.
     * @see #isSetEnergyArea()
     * @see #unsetEnergyArea()
     * @see #getEnergyArea()
     * @generated
     */
    void setEnergyArea( EnergyArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyArea()
     * @see #getEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @generated
     */
    void unsetEnergyArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Area</em>' reference is set.
     * @see #unsetEnergyArea()
     * @see #getEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @generated
     */
    boolean isSetEnergyArea();

    /**
     * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tie Flow</em>' reference list.
     * @see #isSetTieFlow()
     * @see #unsetTieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_TieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getControlArea
     * @model opposite="ControlArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.TieFlow' kind='element'"
     * @generated
     */
    EList< TieFlow > getTieFlow();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getTieFlow <em>Tie Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    void unsetTieFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getTieFlow <em>Tie Flow</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tie Flow</em>' reference list is set.
     * @see #unsetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    boolean isSetTieFlow();

    /**
     * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlArea_ControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getControlArea
     * @model opposite="ControlArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlArea.ControlAreaGeneratingUnit' kind='element'"
     * @generated
     */
    EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    void unsetControlAreaGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area Generating Unit</em>' reference list is set.
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    boolean isSetControlAreaGeneratingUnit();

} // ControlArea
