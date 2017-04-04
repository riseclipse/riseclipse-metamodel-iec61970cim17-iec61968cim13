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
 * A representation of the model object '<em><b>Nonlinear Shunt Compensator Phase Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getSectionNumber <em>Section Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhasePoint()
 * @model
 * @generated
 */
public interface NonlinearShuntCompensatorPhasePoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>B</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #setB(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhasePoint_B()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NonlinearShuntCompensatorPhasePoint.b' kind='element'"
     * @generated
     */
    Float getB();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>B</em>' attribute.
     * @see #isSetB()
     * @see #unsetB()
     * @see #getB()
     * @generated
     */
    void setB( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getB <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetB()
     * @see #getB()
     * @see #setB(Float)
     * @generated
     */
    void unsetB();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getB <em>B</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>B</em>' attribute is set.
     * @see #unsetB()
     * @see #getB()
     * @see #setB(Float)
     * @generated
     */
    boolean isSetB();

    /**
     * Returns the value of the '<em><b>G</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>G</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #setG(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhasePoint_G()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NonlinearShuntCompensatorPhasePoint.g' kind='element'"
     * @generated
     */
    Float getG();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>G</em>' attribute.
     * @see #isSetG()
     * @see #unsetG()
     * @see #getG()
     * @generated
     */
    void setG( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getG <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetG()
     * @see #getG()
     * @see #setG(Float)
     * @generated
     */
    void unsetG();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getG <em>G</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>G</em>' attribute is set.
     * @see #unsetG()
     * @see #getG()
     * @see #setG(Float)
     * @generated
     */
    boolean isSetG();

    /**
     * Returns the value of the '<em><b>Section Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Section Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Section Number</em>' attribute.
     * @see #isSetSectionNumber()
     * @see #unsetSectionNumber()
     * @see #setSectionNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhasePoint_SectionNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NonlinearShuntCompensatorPhasePoint.sectionNumber' kind='element'"
     * @generated
     */
    Integer getSectionNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getSectionNumber <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Section Number</em>' attribute.
     * @see #isSetSectionNumber()
     * @see #unsetSectionNumber()
     * @see #getSectionNumber()
     * @generated
     */
    void setSectionNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getSectionNumber <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSectionNumber()
     * @see #getSectionNumber()
     * @see #setSectionNumber(Integer)
     * @generated
     */
    void unsetSectionNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getSectionNumber <em>Section Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Section Number</em>' attribute is set.
     * @see #unsetSectionNumber()
     * @see #getSectionNumber()
     * @see #setSectionNumber(Integer)
     * @generated
     */
    boolean isSetSectionNumber();

    /**
     * Returns the value of the '<em><b>Nonlinear Shunt Compensator Phase</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase#getNonlinearShuntCompensatorPhasePoints <em>Nonlinear Shunt Compensator Phase Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nonlinear Shunt Compensator Phase</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nonlinear Shunt Compensator Phase</em>' reference.
     * @see #isSetNonlinearShuntCompensatorPhase()
     * @see #unsetNonlinearShuntCompensatorPhase()
     * @see #setNonlinearShuntCompensatorPhase(NonlinearShuntCompensatorPhase)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhasePoint_NonlinearShuntCompensatorPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase#getNonlinearShuntCompensatorPhasePoints
     * @model opposite="NonlinearShuntCompensatorPhasePoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NonlinearShuntCompensatorPhasePoint.NonlinearShuntCompensatorPhase' kind='element'"
     * @generated
     */
    NonlinearShuntCompensatorPhase getNonlinearShuntCompensatorPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nonlinear Shunt Compensator Phase</em>' reference.
     * @see #isSetNonlinearShuntCompensatorPhase()
     * @see #unsetNonlinearShuntCompensatorPhase()
     * @see #getNonlinearShuntCompensatorPhase()
     * @generated
     */
    void setNonlinearShuntCompensatorPhase( NonlinearShuntCompensatorPhase value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonlinearShuntCompensatorPhase()
     * @see #getNonlinearShuntCompensatorPhase()
     * @see #setNonlinearShuntCompensatorPhase(NonlinearShuntCompensatorPhase)
     * @generated
     */
    void unsetNonlinearShuntCompensatorPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nonlinear Shunt Compensator Phase</em>' reference is set.
     * @see #unsetNonlinearShuntCompensatorPhase()
     * @see #getNonlinearShuntCompensatorPhase()
     * @see #setNonlinearShuntCompensatorPhase(NonlinearShuntCompensatorPhase)
     * @generated
     */
    boolean isSetNonlinearShuntCompensatorPhase();

} // NonlinearShuntCompensatorPhasePoint
