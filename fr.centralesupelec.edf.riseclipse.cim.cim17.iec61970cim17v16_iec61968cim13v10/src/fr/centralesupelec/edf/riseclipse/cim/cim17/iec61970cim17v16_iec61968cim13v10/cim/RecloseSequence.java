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
 * A representation of the model object '<em><b>Reclose Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseStep <em>Reclose Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRecloseSequence()
 * @model
 * @generated
 */
public interface RecloseSequence extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Reclose Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reclose Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reclose Delay</em>' attribute.
     * @see #isSetRecloseDelay()
     * @see #unsetRecloseDelay()
     * @see #setRecloseDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRecloseSequence_RecloseDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RecloseSequence.recloseDelay' kind='element'"
     * @generated
     */
    Float getRecloseDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reclose Delay</em>' attribute.
     * @see #isSetRecloseDelay()
     * @see #unsetRecloseDelay()
     * @see #getRecloseDelay()
     * @generated
     */
    void setRecloseDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecloseDelay()
     * @see #getRecloseDelay()
     * @see #setRecloseDelay(Float)
     * @generated
     */
    void unsetRecloseDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reclose Delay</em>' attribute is set.
     * @see #unsetRecloseDelay()
     * @see #getRecloseDelay()
     * @see #setRecloseDelay(Float)
     * @generated
     */
    boolean isSetRecloseDelay();

    /**
     * Returns the value of the '<em><b>Reclose Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reclose Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reclose Step</em>' attribute.
     * @see #isSetRecloseStep()
     * @see #unsetRecloseStep()
     * @see #setRecloseStep(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRecloseSequence_RecloseStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RecloseSequence.recloseStep' kind='element'"
     * @generated
     */
    Integer getRecloseStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reclose Step</em>' attribute.
     * @see #isSetRecloseStep()
     * @see #unsetRecloseStep()
     * @see #getRecloseStep()
     * @generated
     */
    void setRecloseStep( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRecloseStep()
     * @see #getRecloseStep()
     * @see #setRecloseStep(Integer)
     * @generated
     */
    void unsetRecloseStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reclose Step</em>' attribute is set.
     * @see #unsetRecloseStep()
     * @see #getRecloseStep()
     * @see #setRecloseStep(Integer)
     * @generated
     */
    boolean isSetRecloseStep();

    /**
     * Returns the value of the '<em><b>Protected Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protected Switch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protected Switch</em>' reference.
     * @see #isSetProtectedSwitch()
     * @see #unsetProtectedSwitch()
     * @see #setProtectedSwitch(ProtectedSwitch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRecloseSequence_ProtectedSwitch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getRecloseSequences
     * @model opposite="RecloseSequences" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RecloseSequence.ProtectedSwitch' kind='element'"
     * @generated
     */
    ProtectedSwitch getProtectedSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Protected Switch</em>' reference.
     * @see #isSetProtectedSwitch()
     * @see #unsetProtectedSwitch()
     * @see #getProtectedSwitch()
     * @generated
     */
    void setProtectedSwitch( ProtectedSwitch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtectedSwitch()
     * @see #getProtectedSwitch()
     * @see #setProtectedSwitch(ProtectedSwitch)
     * @generated
     */
    void unsetProtectedSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Protected Switch</em>' reference is set.
     * @see #unsetProtectedSwitch()
     * @see #getProtectedSwitch()
     * @see #setProtectedSwitch(ProtectedSwitch)
     * @generated
     */
    boolean isSetProtectedSwitch();

} // RecloseSequence
