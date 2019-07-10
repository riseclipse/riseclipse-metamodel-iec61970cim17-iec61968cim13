/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensatorPhase()
 * @model
 * @generated
 */
public interface ShuntCompensatorPhase extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #setMaximumSections(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensatorPhase_MaximumSections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensatorPhase.maximumSections' kind='element'"
     * @generated
     */
    Integer getMaximumSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Sections</em>' attribute.
     * @see #isSetMaximumSections()
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @generated
     */
    void setMaximumSections( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getMaximumSections <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(Integer)
     * @generated
     */
    void unsetMaximumSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getMaximumSections <em>Maximum Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Sections</em>' attribute is set.
     * @see #unsetMaximumSections()
     * @see #getMaximumSections()
     * @see #setMaximumSections(Integer)
     * @generated
     */
    boolean isSetMaximumSections();

    /**
     * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Sections</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #setNormalSections(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensatorPhase_NormalSections()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensatorPhase.normalSections' kind='element'"
     * @generated
     */
    Integer getNormalSections();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Sections</em>' attribute.
     * @see #isSetNormalSections()
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @generated
     */
    void setNormalSections( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getNormalSections <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(Integer)
     * @generated
     */
    void unsetNormalSections();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getNormalSections <em>Normal Sections</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Sections</em>' attribute is set.
     * @see #unsetNormalSections()
     * @see #getNormalSections()
     * @see #setNormalSections(Integer)
     * @generated
     */
    boolean isSetNormalSections();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensatorPhase_Phase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensatorPhase.phase' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getPhase <em>Phase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhase()
     * @see #getPhase()
     * @see #setPhase(SinglePhaseKind)
     * @generated
     */
    void unsetPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getPhase <em>Phase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getShuntCompensatorPhase <em>Shunt Compensator Phase</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getShuntCompensatorPhase_ShuntCompensator()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator#getShuntCompensatorPhase
     * @model opposite="ShuntCompensatorPhase" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ShuntCompensatorPhase.ShuntCompensator' kind='element'"
     * @generated
     */
    ShuntCompensator getShuntCompensator();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    void unsetShuntCompensator();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shunt Compensator</em>' reference is set.
     * @see #unsetShuntCompensator()
     * @see #getShuntCompensator()
     * @see #setShuntCompensator(ShuntCompensator)
     * @generated
     */
    boolean isSetShuntCompensator();

} // ShuntCompensatorPhase
