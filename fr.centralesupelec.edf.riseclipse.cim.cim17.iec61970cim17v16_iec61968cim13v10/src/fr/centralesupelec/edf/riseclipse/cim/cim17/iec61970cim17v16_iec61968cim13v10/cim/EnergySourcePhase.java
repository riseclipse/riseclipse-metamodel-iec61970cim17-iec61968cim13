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
 * A representation of the model object '<em><b>Energy Source Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getEnergySource <em>Energy Source</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourcePhase()
 * @model
 * @generated
 */
public interface EnergySourcePhase extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Phase</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #setPhase(SinglePhaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourcePhase_Phase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergySourcePhase.phase' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #getPhase()
     * @generated
     */
    void setPhase( SinglePhaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhase()
     * @see #getPhase()
     * @see #setPhase(SinglePhaseKind)
     * @generated
     */
    void unsetPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getPhase <em>Phase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase</em>' attribute is set.
     * @see #unsetPhase()
     * @see #getPhase()
     * @see #setPhase(SinglePhaseKind)
     * @generated
     */
    boolean isSetPhase();

    /**
     * Returns the value of the '<em><b>Energy Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource#getEnergySourcePhase <em>Energy Source Phase</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Source</em>' reference.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see #setEnergySource(EnergySource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergySourcePhase_EnergySource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource#getEnergySourcePhase
     * @model opposite="EnergySourcePhase" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergySourcePhase.EnergySource' kind='element'"
     * @generated
     */
    EnergySource getEnergySource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getEnergySource <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Source</em>' reference.
     * @see #isSetEnergySource()
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @generated
     */
    void setEnergySource( EnergySource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getEnergySource <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergySource()
     * @see #getEnergySource()
     * @see #setEnergySource(EnergySource)
     * @generated
     */
    void unsetEnergySource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase#getEnergySource <em>Energy Source</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Source</em>' reference is set.
     * @see #unsetEnergySource()
     * @see #getEnergySource()
     * @see #setEnergySource(EnergySource)
     * @generated
     */
    boolean isSetEnergySource();

} // EnergySourcePhase
