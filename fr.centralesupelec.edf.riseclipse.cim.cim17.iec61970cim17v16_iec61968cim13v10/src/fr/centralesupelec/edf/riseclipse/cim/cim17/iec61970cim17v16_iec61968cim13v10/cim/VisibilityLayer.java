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
 * A representation of the model object '<em><b>Visibility Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVisibilityLayer()
 * @model
 * @generated
 */
public interface VisibilityLayer extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Drawing Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Drawing Order</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Drawing Order</em>' attribute.
     * @see #isSetDrawingOrder()
     * @see #unsetDrawingOrder()
     * @see #setDrawingOrder(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVisibilityLayer_DrawingOrder()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VisibilityLayer.drawingOrder' kind='element'"
     * @generated
     */
    Integer getDrawingOrder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Drawing Order</em>' attribute.
     * @see #isSetDrawingOrder()
     * @see #unsetDrawingOrder()
     * @see #getDrawingOrder()
     * @generated
     */
    void setDrawingOrder( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(Integer)
     * @generated
     */
    void unsetDrawingOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drawing Order</em>' attribute is set.
     * @see #unsetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(Integer)
     * @generated
     */
    boolean isSetDrawingOrder();

    /**
     * Returns the value of the '<em><b>Visible Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visible Objects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visible Objects</em>' reference list.
     * @see #isSetVisibleObjects()
     * @see #unsetVisibleObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVisibilityLayer_VisibleObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getVisibilityLayers
     * @model opposite="VisibilityLayers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VisibilityLayer.VisibleObjects' kind='element'"
     * @generated
     */
    EList< DiagramObject > getVisibleObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibleObjects()
     * @see #getVisibleObjects()
     * @generated
     */
    void unsetVisibleObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visible Objects</em>' reference list is set.
     * @see #unsetVisibleObjects()
     * @see #getVisibleObjects()
     * @generated
     */
    boolean isSetVisibleObjects();

} // VisibilityLayer
