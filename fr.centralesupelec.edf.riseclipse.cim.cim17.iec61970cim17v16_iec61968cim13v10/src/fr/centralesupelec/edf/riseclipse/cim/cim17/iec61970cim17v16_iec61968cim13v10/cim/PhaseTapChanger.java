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
 * A representation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChanger()
 * @model
 * @generated
 */
public interface PhaseTapChanger extends TapChanger {
    /**
     * Returns the value of the '<em><b>Transformer End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChanger_TransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getPhaseTapChanger
     * @model opposite="PhaseTapChanger" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChanger.TransformerEnd' kind='element'"
     * @generated
     */
    TransformerEnd getTransformerEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @generated
     */
    void setTransformerEnd( TransformerEnd value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    void unsetTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End</em>' reference is set.
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    boolean isSetTransformerEnd();

} // PhaseTapChanger
