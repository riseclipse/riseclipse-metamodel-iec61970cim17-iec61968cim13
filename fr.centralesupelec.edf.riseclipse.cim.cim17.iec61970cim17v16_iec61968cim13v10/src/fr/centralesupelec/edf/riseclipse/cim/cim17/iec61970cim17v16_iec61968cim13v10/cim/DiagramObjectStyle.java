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
 * A representation of the model object '<em><b>Diagram Object Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObjectStyle()
 * @model
 * @generated
 */
public interface DiagramObjectStyle extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Styled Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Styled Objects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Styled Objects</em>' reference list.
     * @see #isSetStyledObjects()
     * @see #unsetStyledObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObjectStyle_StyledObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle
     * @model opposite="DiagramObjectStyle" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObjectStyle.StyledObjects' kind='element'"
     * @generated
     */
    EList< DiagramObject > getStyledObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStyledObjects()
     * @see #getStyledObjects()
     * @generated
     */
    void unsetStyledObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Styled Objects</em>' reference list is set.
     * @see #unsetStyledObjects()
     * @see #getStyledObjects()
     * @generated
     */
    boolean isSetStyledObjects();

} // DiagramObjectStyle
