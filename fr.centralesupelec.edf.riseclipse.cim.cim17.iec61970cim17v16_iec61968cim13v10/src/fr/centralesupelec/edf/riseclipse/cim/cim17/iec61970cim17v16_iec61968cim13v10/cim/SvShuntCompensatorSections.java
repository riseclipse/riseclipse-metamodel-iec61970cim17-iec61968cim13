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
 * A representation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSvShuntCompensatorSections()
 * @model
 * @generated
 */
public interface SvShuntCompensatorSections extends StateVariable {
    /**
     * Returns the value of the '<em><b>Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #setSections(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSvShuntCompensatorSections_Sections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SvShuntCompensatorSections.sections' kind='element'"
     * @generated
     */
    Float getSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sections</em>' attribute.
     * @see #isSetSections()
     * @see #unsetSections()
     * @see #getSections()
     * @generated
     */
    void setSections( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSections()
     * @see #getSections()
     * @see #setSections(Float)
     * @generated
     */
    void unsetSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sections</em>' attribute is set.
     * @see #unsetSections()
     * @see #getSections()
     * @see #setSections(Float)
     * @generated
     */
    boolean isSetSections();

    /**
     * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shunt Compensator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shunt Compensator</em>' reference.
     * @see #isSetShuntCompensator()
     * @see #unsetShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSvShuntCompensatorSections_ShuntCompensator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getSvShuntCompensatorSections
     * @model opposite="SvShuntCompensatorSections" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SvShuntCompensatorSections.ShuntCompensator' kind='element'"
     * @generated
     */
    ShuntCompensator getShuntCompensator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shunt Compensator</em>' reference.
     * @see #isSetShuntCompensator()
     * @see #unsetShuntCompensator()
     * @see #getShuntCompensator()
     * @generated
     */
    void setShuntCompensator( ShuntCompensator value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    void unsetShuntCompensator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shunt Compensator</em>' reference is set.
     * @see #unsetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    boolean isSetShuntCompensator();

} // SvShuntCompensatorSections
