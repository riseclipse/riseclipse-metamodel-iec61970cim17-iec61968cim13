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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Orientation</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrientationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orientation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrientationKind
     * @see #isSetOrientation()
     * @see #unsetOrientation()
     * @see #setOrientation(OrientationKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_Orientation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.orientation' kind='element'"
     * @generated
     */
    OrientationKind getOrientation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getOrientation <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Orientation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrientationKind
     * @see #isSetOrientation()
     * @see #unsetOrientation()
     * @see #getOrientation()
     * @generated
     */
    void setOrientation( OrientationKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getOrientation <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrientation()
     * @see #getOrientation()
     * @see #setOrientation(OrientationKind)
     * @generated
     */
    void unsetOrientation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getOrientation <em>Orientation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Orientation</em>' attribute is set.
     * @see #unsetOrientation()
     * @see #getOrientation()
     * @see #setOrientation(OrientationKind)
     * @generated
     */
    boolean isSetOrientation();

    /**
     * Returns the value of the '<em><b>X1 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X1 Initial View</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X1 Initial View</em>' attribute.
     * @see #isSetX1InitialView()
     * @see #unsetX1InitialView()
     * @see #setX1InitialView(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_X1InitialView()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.x1InitialView' kind='element'"
     * @generated
     */
    Float getX1InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1 Initial View</em>' attribute.
     * @see #isSetX1InitialView()
     * @see #unsetX1InitialView()
     * @see #getX1InitialView()
     * @generated
     */
    void setX1InitialView( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1InitialView()
     * @see #getX1InitialView()
     * @see #setX1InitialView(Float)
     * @generated
     */
    void unsetX1InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1 Initial View</em>' attribute is set.
     * @see #unsetX1InitialView()
     * @see #getX1InitialView()
     * @see #setX1InitialView(Float)
     * @generated
     */
    boolean isSetX1InitialView();

    /**
     * Returns the value of the '<em><b>X2 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X2 Initial View</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X2 Initial View</em>' attribute.
     * @see #isSetX2InitialView()
     * @see #unsetX2InitialView()
     * @see #setX2InitialView(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_X2InitialView()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.x2InitialView' kind='element'"
     * @generated
     */
    Float getX2InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2 Initial View</em>' attribute.
     * @see #isSetX2InitialView()
     * @see #unsetX2InitialView()
     * @see #getX2InitialView()
     * @generated
     */
    void setX2InitialView( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2InitialView()
     * @see #getX2InitialView()
     * @see #setX2InitialView(Float)
     * @generated
     */
    void unsetX2InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2 Initial View</em>' attribute is set.
     * @see #unsetX2InitialView()
     * @see #getX2InitialView()
     * @see #setX2InitialView(Float)
     * @generated
     */
    boolean isSetX2InitialView();

    /**
     * Returns the value of the '<em><b>Y1 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y1 Initial View</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y1 Initial View</em>' attribute.
     * @see #isSetY1InitialView()
     * @see #unsetY1InitialView()
     * @see #setY1InitialView(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_Y1InitialView()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.y1InitialView' kind='element'"
     * @generated
     */
    Float getY1InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1 Initial View</em>' attribute.
     * @see #isSetY1InitialView()
     * @see #unsetY1InitialView()
     * @see #getY1InitialView()
     * @generated
     */
    void setY1InitialView( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1InitialView()
     * @see #getY1InitialView()
     * @see #setY1InitialView(Float)
     * @generated
     */
    void unsetY1InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1 Initial View</em>' attribute is set.
     * @see #unsetY1InitialView()
     * @see #getY1InitialView()
     * @see #setY1InitialView(Float)
     * @generated
     */
    boolean isSetY1InitialView();

    /**
     * Returns the value of the '<em><b>Y2 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y2 Initial View</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y2 Initial View</em>' attribute.
     * @see #isSetY2InitialView()
     * @see #unsetY2InitialView()
     * @see #setY2InitialView(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_Y2InitialView()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.y2InitialView' kind='element'"
     * @generated
     */
    Float getY2InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2 Initial View</em>' attribute.
     * @see #isSetY2InitialView()
     * @see #unsetY2InitialView()
     * @see #getY2InitialView()
     * @generated
     */
    void setY2InitialView( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2InitialView()
     * @see #getY2InitialView()
     * @see #setY2InitialView(Float)
     * @generated
     */
    void unsetY2InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2 Initial View</em>' attribute is set.
     * @see #unsetY2InitialView()
     * @see #getY2InitialView()
     * @see #setY2InitialView(Float)
     * @generated
     */
    boolean isSetY2InitialView();

    /**
     * Returns the value of the '<em><b>Diagram Elements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Elements</em>' reference list.
     * @see #isSetDiagramElements()
     * @see #unsetDiagramElements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_DiagramElements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram
     * @model opposite="Diagram" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.DiagramElements' kind='element'"
     * @generated
     */
    EList< DiagramObject > getDiagramElements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramElements()
     * @see #getDiagramElements()
     * @generated
     */
    void unsetDiagramElements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Elements</em>' reference list is set.
     * @see #unsetDiagramElements()
     * @see #getDiagramElements()
     * @generated
     */
    boolean isSetDiagramElements();

    /**
     * Returns the value of the '<em><b>Diagram Style</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramStyle#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Style</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Style</em>' reference.
     * @see #isSetDiagramStyle()
     * @see #unsetDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagram_DiagramStyle()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramStyle#getDiagram
     * @model opposite="Diagram" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Diagram.DiagramStyle' kind='element'"
     * @generated
     */
    DiagramStyle getDiagramStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Style</em>' reference.
     * @see #isSetDiagramStyle()
     * @see #unsetDiagramStyle()
     * @see #getDiagramStyle()
     * @generated
     */
    void setDiagramStyle( DiagramStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramStyle()
     * @see #getDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @generated
     */
    void unsetDiagramStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Style</em>' reference is set.
     * @see #unsetDiagramStyle()
     * @see #getDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @generated
     */
    boolean isSetDiagramStyle();

} // Diagram
