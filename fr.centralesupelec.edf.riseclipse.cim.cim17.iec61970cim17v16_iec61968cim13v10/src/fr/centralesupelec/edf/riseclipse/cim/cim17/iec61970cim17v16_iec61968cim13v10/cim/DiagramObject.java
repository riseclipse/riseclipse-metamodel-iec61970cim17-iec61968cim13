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
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getRotation <em>Rotation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject()
 * @model
 * @generated
 */
public interface DiagramObject extends IdentifiedObject {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_DrawingOrder()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.drawingOrder' kind='element'"
     * @generated
     */
    Integer getDrawingOrder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(Integer)
     * @generated
     */
    void unsetDrawingOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Is Polygon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Polygon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Polygon</em>' attribute.
     * @see #isSetIsPolygon()
     * @see #unsetIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_IsPolygon()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.isPolygon' kind='element'"
     * @generated
     */
    Boolean getIsPolygon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Polygon</em>' attribute.
     * @see #isSetIsPolygon()
     * @see #unsetIsPolygon()
     * @see #getIsPolygon()
     * @generated
     */
    void setIsPolygon( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPolygon()
     * @see #getIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @generated
     */
    void unsetIsPolygon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Polygon</em>' attribute is set.
     * @see #unsetIsPolygon()
     * @see #getIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @generated
     */
    boolean isSetIsPolygon();

    /**
     * Returns the value of the '<em><b>Offset X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset X</em>' attribute.
     * @see #isSetOffsetX()
     * @see #unsetOffsetX()
     * @see #setOffsetX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_OffsetX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.offsetX' kind='element'"
     * @generated
     */
    Float getOffsetX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset X</em>' attribute.
     * @see #isSetOffsetX()
     * @see #unsetOffsetX()
     * @see #getOffsetX()
     * @generated
     */
    void setOffsetX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetX()
     * @see #getOffsetX()
     * @see #setOffsetX(Float)
     * @generated
     */
    void unsetOffsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset X</em>' attribute is set.
     * @see #unsetOffsetX()
     * @see #getOffsetX()
     * @see #setOffsetX(Float)
     * @generated
     */
    boolean isSetOffsetX();

    /**
     * Returns the value of the '<em><b>Offset Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Y</em>' attribute.
     * @see #isSetOffsetY()
     * @see #unsetOffsetY()
     * @see #setOffsetY(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_OffsetY()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.offsetY' kind='element'"
     * @generated
     */
    Float getOffsetY();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Y</em>' attribute.
     * @see #isSetOffsetY()
     * @see #unsetOffsetY()
     * @see #getOffsetY()
     * @generated
     */
    void setOffsetY( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetY()
     * @see #getOffsetY()
     * @see #setOffsetY(Float)
     * @generated
     */
    void unsetOffsetY();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Y</em>' attribute is set.
     * @see #unsetOffsetY()
     * @see #getOffsetY()
     * @see #setOffsetY(Float)
     * @generated
     */
    boolean isSetOffsetY();

    /**
     * Returns the value of the '<em><b>Rotation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotation</em>' attribute.
     * @see #isSetRotation()
     * @see #unsetRotation()
     * @see #setRotation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_Rotation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.rotation' kind='element'"
     * @generated
     */
    Float getRotation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotation</em>' attribute.
     * @see #isSetRotation()
     * @see #unsetRotation()
     * @see #getRotation()
     * @generated
     */
    void setRotation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotation()
     * @see #getRotation()
     * @see #setRotation(Float)
     * @generated
     */
    void unsetRotation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotation</em>' attribute is set.
     * @see #unsetRotation()
     * @see #getRotation()
     * @see #setRotation(Float)
     * @generated
     */
    boolean isSetRotation();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' reference.
     * @see #isSetDiagram()
     * @see #unsetDiagram()
     * @see #setDiagram(Diagram)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_Diagram()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram#getDiagramElements
     * @model opposite="DiagramElements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.Diagram' kind='element'"
     * @generated
     */
    Diagram getDiagram();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' reference.
     * @see #isSetDiagram()
     * @see #unsetDiagram()
     * @see #getDiagram()
     * @generated
     */
    void setDiagram( Diagram value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagram()
     * @see #getDiagram()
     * @see #setDiagram(Diagram)
     * @generated
     */
    void unsetDiagram();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram</em>' reference is set.
     * @see #unsetDiagram()
     * @see #getDiagram()
     * @see #setDiagram(Diagram)
     * @generated
     */
    boolean isSetDiagram();

    /**
     * Returns the value of the '<em><b>Diagram Object Style</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Object Style</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Object Style</em>' reference.
     * @see #isSetDiagramObjectStyle()
     * @see #unsetDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_DiagramObjectStyle()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle#getStyledObjects
     * @model opposite="StyledObjects" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.DiagramObjectStyle' kind='element'"
     * @generated
     */
    DiagramObjectStyle getDiagramObjectStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Object Style</em>' reference.
     * @see #isSetDiagramObjectStyle()
     * @see #unsetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @generated
     */
    void setDiagramObjectStyle( DiagramObjectStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @generated
     */
    void unsetDiagramObjectStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Style</em>' reference is set.
     * @see #unsetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @generated
     */
    boolean isSetDiagramObjectStyle();

    /**
     * Returns the value of the '<em><b>Identified Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identified Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identified Object</em>' reference.
     * @see #isSetIdentifiedObject()
     * @see #unsetIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_IdentifiedObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDiagramObjects
     * @model opposite="DiagramObjects" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.IdentifiedObject' kind='element'"
     * @generated
     */
    IdentifiedObject getIdentifiedObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identified Object</em>' reference.
     * @see #isSetIdentifiedObject()
     * @see #unsetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @generated
     */
    void setIdentifiedObject( IdentifiedObject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @generated
     */
    void unsetIdentifiedObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Identified Object</em>' reference is set.
     * @see #unsetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @generated
     */
    boolean isSetIdentifiedObject();

    /**
     * Returns the value of the '<em><b>Diagram Object Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Object Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Object Points</em>' reference list.
     * @see #isSetDiagramObjectPoints()
     * @see #unsetDiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_DiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint#getDiagramObject
     * @model opposite="DiagramObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.DiagramObjectPoints' kind='element'"
     * @generated
     */
    EList< DiagramObjectPoint > getDiagramObjectPoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    void unsetDiagramObjectPoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Points</em>' reference list is set.
     * @see #unsetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    boolean isSetDiagramObjectPoints();

    /**
     * Returns the value of the '<em><b>Visibility Layers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility Layers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility Layers</em>' reference list.
     * @see #isSetVisibilityLayers()
     * @see #unsetVisibilityLayers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiagramObject_VisibilityLayers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer#getVisibleObjects
     * @model opposite="VisibleObjects" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiagramObject.VisibilityLayers' kind='element'"
     * @generated
     */
    EList< VisibilityLayer > getVisibilityLayers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibilityLayers()
     * @see #getVisibilityLayers()
     * @generated
     */
    void unsetVisibilityLayers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility Layers</em>' reference list is set.
     * @see #unsetVisibilityLayers()
     * @see #getVisibilityLayers()
     * @generated
     */
    boolean isSetVisibilityLayers();

} // DiagramObject
