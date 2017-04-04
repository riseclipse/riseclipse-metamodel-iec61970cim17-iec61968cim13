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
 * A representation of the model object '<em><b>Object Reverse Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification <em>Object Modification</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getObjectReverseModification()
 * @model
 * @generated
 */
public interface ObjectReverseModification extends ChangeSetMember {
    /**
     * Returns the value of the '<em><b>Object Modification</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification <em>Object Reverse Modification</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Modification</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Modification</em>' reference.
     * @see #isSetObjectModification()
     * @see #unsetObjectModification()
     * @see #setObjectModification(ObjectModification)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getObjectReverseModification_ObjectModification()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectModification#getObjectReverseModification
     * @model opposite="ObjectReverseModification" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ObjectReverseModification.ObjectModification' kind='element'"
     * @generated
     */
    ObjectModification getObjectModification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification <em>Object Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Modification</em>' reference.
     * @see #isSetObjectModification()
     * @see #unsetObjectModification()
     * @see #getObjectModification()
     * @generated
     */
    void setObjectModification( ObjectModification value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification <em>Object Modification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetObjectModification()
     * @see #getObjectModification()
     * @see #setObjectModification(ObjectModification)
     * @generated
     */
    void unsetObjectModification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ObjectReverseModification#getObjectModification <em>Object Modification</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Object Modification</em>' reference is set.
     * @see #unsetObjectModification()
     * @see #getObjectModification()
     * @see #setObjectModification(ObjectModification)
     * @generated
     */
    boolean isSetObjectModification();

} // ObjectReverseModification
