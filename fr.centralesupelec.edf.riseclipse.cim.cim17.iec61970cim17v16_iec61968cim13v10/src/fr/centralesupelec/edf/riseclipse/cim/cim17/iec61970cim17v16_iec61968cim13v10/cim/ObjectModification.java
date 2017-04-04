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
 * A representation of the model object '<em><b>Object Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification <em>Object Reverse Modification</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getObjectModification()
 * @model
 * @generated
 */
public interface ObjectModification extends ChangeSetMember {
    /**
     * Returns the value of the '<em><b>Object Reverse Modification</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification <em>Object Modification</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Reverse Modification</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Reverse Modification</em>' reference.
     * @see #isSetObjectReverseModification()
     * @see #unsetObjectReverseModification()
     * @see #setObjectReverseModification(ObjectReverseModification)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getObjectModification_ObjectReverseModification()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification
     * @model opposite="ObjectModification" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ObjectModification.ObjectReverseModification' kind='element'"
     * @generated
     */
    ObjectReverseModification getObjectReverseModification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification <em>Object Reverse Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Reverse Modification</em>' reference.
     * @see #isSetObjectReverseModification()
     * @see #unsetObjectReverseModification()
     * @see #getObjectReverseModification()
     * @generated
     */
    void setObjectReverseModification( ObjectReverseModification value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification <em>Object Reverse Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetObjectReverseModification()
     * @see #getObjectReverseModification()
     * @see #setObjectReverseModification(ObjectReverseModification)
     * @generated
     */
    void unsetObjectReverseModification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification <em>Object Reverse Modification</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Object Reverse Modification</em>' reference is set.
     * @see #unsetObjectReverseModification()
     * @see #getObjectReverseModification()
     * @see #setObjectReverseModification(ObjectReverseModification)
     * @generated
     */
    boolean isSetObjectReverseModification();

} // ObjectModification
