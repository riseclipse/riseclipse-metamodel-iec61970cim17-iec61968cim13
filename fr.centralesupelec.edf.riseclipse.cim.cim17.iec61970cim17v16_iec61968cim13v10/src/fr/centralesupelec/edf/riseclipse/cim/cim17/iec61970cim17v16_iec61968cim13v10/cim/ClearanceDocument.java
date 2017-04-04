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
 * A representation of the model object '<em><b>Clearance Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeDeenergised <em>Must Be Deenergised</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeGrounded <em>Must Be Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getClearanceAction <em>Clearance Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getTaggedPSRs <em>Tagged PS Rs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getClearanceDocument()
 * @model
 * @generated
 */
public interface ClearanceDocument extends SafetyDocument {
    /**
     * Returns the value of the '<em><b>Must Be Deenergised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Be Deenergised</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Must Be Deenergised</em>' attribute.
     * @see #isSetMustBeDeenergised()
     * @see #unsetMustBeDeenergised()
     * @see #setMustBeDeenergised(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getClearanceDocument_MustBeDeenergised()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ClearanceDocument.mustBeDeenergised' kind='element'"
     * @generated
     */
    Boolean getMustBeDeenergised();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeDeenergised <em>Must Be Deenergised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Be Deenergised</em>' attribute.
     * @see #isSetMustBeDeenergised()
     * @see #unsetMustBeDeenergised()
     * @see #getMustBeDeenergised()
     * @generated
     */
    void setMustBeDeenergised( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeDeenergised <em>Must Be Deenergised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMustBeDeenergised()
     * @see #getMustBeDeenergised()
     * @see #setMustBeDeenergised(Boolean)
     * @generated
     */
    void unsetMustBeDeenergised();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeDeenergised <em>Must Be Deenergised</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Must Be Deenergised</em>' attribute is set.
     * @see #unsetMustBeDeenergised()
     * @see #getMustBeDeenergised()
     * @see #setMustBeDeenergised(Boolean)
     * @generated
     */
    boolean isSetMustBeDeenergised();

    /**
     * Returns the value of the '<em><b>Must Be Grounded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Be Grounded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Must Be Grounded</em>' attribute.
     * @see #isSetMustBeGrounded()
     * @see #unsetMustBeGrounded()
     * @see #setMustBeGrounded(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getClearanceDocument_MustBeGrounded()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ClearanceDocument.mustBeGrounded' kind='element'"
     * @generated
     */
    Boolean getMustBeGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeGrounded <em>Must Be Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Be Grounded</em>' attribute.
     * @see #isSetMustBeGrounded()
     * @see #unsetMustBeGrounded()
     * @see #getMustBeGrounded()
     * @generated
     */
    void setMustBeGrounded( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeGrounded <em>Must Be Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMustBeGrounded()
     * @see #getMustBeGrounded()
     * @see #setMustBeGrounded(Boolean)
     * @generated
     */
    void unsetMustBeGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getMustBeGrounded <em>Must Be Grounded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Must Be Grounded</em>' attribute is set.
     * @see #unsetMustBeGrounded()
     * @see #getMustBeGrounded()
     * @see #setMustBeGrounded(Boolean)
     * @generated
     */
    boolean isSetMustBeGrounded();

    /**
     * Returns the value of the '<em><b>Clearance Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction#getClearance <em>Clearance</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clearance Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clearance Action</em>' reference.
     * @see #isSetClearanceAction()
     * @see #unsetClearanceAction()
     * @see #setClearanceAction(ClearanceAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getClearanceDocument_ClearanceAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction#getClearance
     * @model opposite="Clearance" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ClearanceDocument.ClearanceAction' kind='element'"
     * @generated
     */
    ClearanceAction getClearanceAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getClearanceAction <em>Clearance Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clearance Action</em>' reference.
     * @see #isSetClearanceAction()
     * @see #unsetClearanceAction()
     * @see #getClearanceAction()
     * @generated
     */
    void setClearanceAction( ClearanceAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getClearanceAction <em>Clearance Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClearanceAction()
     * @see #getClearanceAction()
     * @see #setClearanceAction(ClearanceAction)
     * @generated
     */
    void unsetClearanceAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getClearanceAction <em>Clearance Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Clearance Action</em>' reference is set.
     * @see #unsetClearanceAction()
     * @see #getClearanceAction()
     * @see #setClearanceAction(ClearanceAction)
     * @generated
     */
    boolean isSetClearanceAction();

    /**
     * Returns the value of the '<em><b>Tagged PS Rs</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getClearances <em>Clearances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tagged PS Rs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tagged PS Rs</em>' reference list.
     * @see #isSetTaggedPSRs()
     * @see #unsetTaggedPSRs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getClearanceDocument_TaggedPSRs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getClearances
     * @model opposite="Clearances" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ClearanceDocument.TaggedPSRs' kind='element'"
     * @generated
     */
    EList< PowerSystemResource > getTaggedPSRs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getTaggedPSRs <em>Tagged PS Rs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaggedPSRs()
     * @see #getTaggedPSRs()
     * @generated
     */
    void unsetTaggedPSRs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getTaggedPSRs <em>Tagged PS Rs</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tagged PS Rs</em>' reference list is set.
     * @see #unsetTaggedPSRs()
     * @see #getTaggedPSRs()
     * @generated
     */
    boolean isSetTaggedPSRs();

} // ClearanceDocument
