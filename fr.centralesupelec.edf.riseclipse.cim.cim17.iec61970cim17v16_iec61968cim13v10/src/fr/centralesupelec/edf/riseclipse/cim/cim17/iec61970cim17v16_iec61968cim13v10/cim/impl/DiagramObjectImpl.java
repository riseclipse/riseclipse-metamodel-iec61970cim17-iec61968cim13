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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Diagram;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectStyle;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VisibilityLayer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getDrawingOrder <em>Drawing Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getIsPolygon <em>Is Polygon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getDiagramObjectStyle <em>Diagram Object Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getIdentifiedObject <em>Identified Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectImpl#getVisibilityLayers <em>Visibility Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramObjectImpl extends IdentifiedObjectImpl implements DiagramObject {
    /**
     * The default value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingOrder()
     * @generated
     * @ordered
     */
    protected static final Integer DRAWING_ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrawingOrder()
     * @generated
     * @ordered
     */
    protected Integer drawingOrder = DRAWING_ORDER_EDEFAULT;

    /**
     * This is true if the Drawing Order attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drawingOrderESet;

    /**
     * The default value of the '{@link #getIsPolygon() <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPolygon()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_POLYGON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPolygon() <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPolygon()
     * @generated
     * @ordered
     */
    protected Boolean isPolygon = IS_POLYGON_EDEFAULT;

    /**
     * This is true if the Is Polygon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPolygonESet;

    /**
     * The default value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetX()
     * @generated
     * @ordered
     */
    protected static final Float OFFSET_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetX()
     * @generated
     * @ordered
     */
    protected Float offsetX = OFFSET_X_EDEFAULT;

    /**
     * This is true if the Offset X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetXESet;

    /**
     * The default value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetY()
     * @generated
     * @ordered
     */
    protected static final Float OFFSET_Y_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffsetY()
     * @generated
     * @ordered
     */
    protected Float offsetY = OFFSET_Y_EDEFAULT;

    /**
     * This is true if the Offset Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetYESet;

    /**
     * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotation()
     * @generated
     * @ordered
     */
    protected static final Float ROTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotation()
     * @generated
     * @ordered
     */
    protected Float rotation = ROTATION_EDEFAULT;

    /**
     * This is true if the Rotation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rotationESet;

    /**
     * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagram()
     * @generated
     * @ordered
     */
    protected Diagram diagram;

    /**
     * This is true if the Diagram reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diagramESet;

    /**
     * The cached value of the '{@link #getDiagramObjectStyle() <em>Diagram Object Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjectStyle()
     * @generated
     * @ordered
     */
    protected DiagramObjectStyle diagramObjectStyle;

    /**
     * This is true if the Diagram Object Style reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diagramObjectStyleESet;

    /**
     * The cached value of the '{@link #getIdentifiedObject() <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifiedObject()
     * @generated
     * @ordered
     */
    protected IdentifiedObject identifiedObject;

    /**
     * This is true if the Identified Object reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean identifiedObjectESet;

    /**
     * The cached value of the '{@link #getDiagramObjectPoints() <em>Diagram Object Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramObjectPoints()
     * @generated
     * @ordered
     */
    protected EList< DiagramObjectPoint > diagramObjectPoints;

    /**
     * The cached value of the '{@link #getVisibilityLayers() <em>Visibility Layers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibilityLayers()
     * @generated
     * @ordered
     */
    protected EList< VisibilityLayer > visibilityLayers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiagramObject();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDrawingOrder() {
        return drawingOrder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrawingOrder( Integer newDrawingOrder ) {
        Integer oldDrawingOrder = drawingOrder;
        drawingOrder = newDrawingOrder;
        boolean oldDrawingOrderESet = drawingOrderESet;
        drawingOrderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER, oldDrawingOrder, drawingOrder, !oldDrawingOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrawingOrder() {
        Integer oldDrawingOrder = drawingOrder;
        boolean oldDrawingOrderESet = drawingOrderESet;
        drawingOrder = DRAWING_ORDER_EDEFAULT;
        drawingOrderESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER,
                    oldDrawingOrder, DRAWING_ORDER_EDEFAULT, oldDrawingOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrawingOrder() {
        return drawingOrderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPolygon() {
        return isPolygon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPolygon( Boolean newIsPolygon ) {
        Boolean oldIsPolygon = isPolygon;
        isPolygon = newIsPolygon;
        boolean oldIsPolygonESet = isPolygonESet;
        isPolygonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM_OBJECT__IS_POLYGON, oldIsPolygon, isPolygon, !oldIsPolygonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPolygon() {
        Boolean oldIsPolygon = isPolygon;
        boolean oldIsPolygonESet = isPolygonESet;
        isPolygon = IS_POLYGON_EDEFAULT;
        isPolygonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGRAM_OBJECT__IS_POLYGON, oldIsPolygon, IS_POLYGON_EDEFAULT, oldIsPolygonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPolygon() {
        return isPolygonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOffsetX() {
        return offsetX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOffsetX( Float newOffsetX ) {
        Float oldOffsetX = offsetX;
        offsetX = newOffsetX;
        boolean oldOffsetXESet = offsetXESet;
        offsetXESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM_OBJECT__OFFSET_X, oldOffsetX, offsetX, !oldOffsetXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOffsetX() {
        Float oldOffsetX = offsetX;
        boolean oldOffsetXESet = offsetXESet;
        offsetX = OFFSET_X_EDEFAULT;
        offsetXESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGRAM_OBJECT__OFFSET_X, oldOffsetX, OFFSET_X_EDEFAULT, oldOffsetXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOffsetX() {
        return offsetXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOffsetY() {
        return offsetY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOffsetY( Float newOffsetY ) {
        Float oldOffsetY = offsetY;
        offsetY = newOffsetY;
        boolean oldOffsetYESet = offsetYESet;
        offsetYESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM_OBJECT__OFFSET_Y, oldOffsetY, offsetY, !oldOffsetYESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOffsetY() {
        Float oldOffsetY = offsetY;
        boolean oldOffsetYESet = offsetYESet;
        offsetY = OFFSET_Y_EDEFAULT;
        offsetYESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGRAM_OBJECT__OFFSET_Y, oldOffsetY, OFFSET_Y_EDEFAULT, oldOffsetYESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOffsetY() {
        return offsetYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRotation() {
        return rotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotation( Float newRotation ) {
        Float oldRotation = rotation;
        rotation = newRotation;
        boolean oldRotationESet = rotationESet;
        rotationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM_OBJECT__ROTATION, oldRotation, rotation, !oldRotationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotation() {
        Float oldRotation = rotation;
        boolean oldRotationESet = rotationESet;
        rotation = ROTATION_EDEFAULT;
        rotationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGRAM_OBJECT__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotation() {
        return rotationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Diagram getDiagram() {
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram( Diagram newDiagram, NotificationChain msgs ) {
        Diagram oldDiagram = diagram;
        diagram = newDiagram;
        boolean oldDiagramESet = diagramESet;
        diagramESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM, oldDiagram, newDiagram, !oldDiagramESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiagram( Diagram newDiagram ) {
        if( newDiagram != diagram ) {
            NotificationChain msgs = null;
            if( diagram != null ) msgs = ( ( InternalEObject ) diagram ).eInverseRemove( this,
                    CimPackage.DIAGRAM__DIAGRAM_ELEMENTS, Diagram.class, msgs );
            if( newDiagram != null ) msgs = ( ( InternalEObject ) newDiagram ).eInverseAdd( this,
                    CimPackage.DIAGRAM__DIAGRAM_ELEMENTS, Diagram.class, msgs );
            msgs = basicSetDiagram( newDiagram, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramESet = diagramESet;
            diagramESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM, newDiagram, newDiagram, !oldDiagramESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiagram( NotificationChain msgs ) {
        Diagram oldDiagram = diagram;
        diagram = null;
        boolean oldDiagramESet = diagramESet;
        diagramESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM, oldDiagram, null, oldDiagramESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagram() {
        if( diagram != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) diagram ).eInverseRemove( this, CimPackage.DIAGRAM__DIAGRAM_ELEMENTS,
                    Diagram.class, msgs );
            msgs = basicUnsetDiagram( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramESet = diagramESet;
            diagramESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM, null, null, oldDiagramESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagram() {
        return diagramESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramObjectStyle getDiagramObjectStyle() {
        return diagramObjectStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagramObjectStyle( DiagramObjectStyle newDiagramObjectStyle,
            NotificationChain msgs ) {
        DiagramObjectStyle oldDiagramObjectStyle = diagramObjectStyle;
        diagramObjectStyle = newDiagramObjectStyle;
        boolean oldDiagramObjectStyleESet = diagramObjectStyleESet;
        diagramObjectStyleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE, oldDiagramObjectStyle, newDiagramObjectStyle,
                    !oldDiagramObjectStyleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiagramObjectStyle( DiagramObjectStyle newDiagramObjectStyle ) {
        if( newDiagramObjectStyle != diagramObjectStyle ) {
            NotificationChain msgs = null;
            if( diagramObjectStyle != null ) msgs = ( ( InternalEObject ) diagramObjectStyle ).eInverseRemove( this,
                    CimPackage.DIAGRAM_OBJECT_STYLE__STYLED_OBJECTS, DiagramObjectStyle.class, msgs );
            if( newDiagramObjectStyle != null ) msgs = ( ( InternalEObject ) newDiagramObjectStyle ).eInverseAdd( this,
                    CimPackage.DIAGRAM_OBJECT_STYLE__STYLED_OBJECTS, DiagramObjectStyle.class, msgs );
            msgs = basicSetDiagramObjectStyle( newDiagramObjectStyle, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectStyleESet = diagramObjectStyleESet;
            diagramObjectStyleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE,
                        newDiagramObjectStyle, newDiagramObjectStyle, !oldDiagramObjectStyleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiagramObjectStyle( NotificationChain msgs ) {
        DiagramObjectStyle oldDiagramObjectStyle = diagramObjectStyle;
        diagramObjectStyle = null;
        boolean oldDiagramObjectStyleESet = diagramObjectStyleESet;
        diagramObjectStyleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE, oldDiagramObjectStyle, null,
                    oldDiagramObjectStyleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramObjectStyle() {
        if( diagramObjectStyle != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) diagramObjectStyle ).eInverseRemove( this,
                    CimPackage.DIAGRAM_OBJECT_STYLE__STYLED_OBJECTS, DiagramObjectStyle.class, msgs );
            msgs = basicUnsetDiagramObjectStyle( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramObjectStyleESet = diagramObjectStyleESet;
            diagramObjectStyleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE, null, null, oldDiagramObjectStyleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjectStyle() {
        return diagramObjectStyleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IdentifiedObject getIdentifiedObject() {
        return identifiedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIdentifiedObject( IdentifiedObject newIdentifiedObject, NotificationChain msgs ) {
        IdentifiedObject oldIdentifiedObject = identifiedObject;
        identifiedObject = newIdentifiedObject;
        boolean oldIdentifiedObjectESet = identifiedObjectESet;
        identifiedObjectESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT, oldIdentifiedObject, newIdentifiedObject,
                    !oldIdentifiedObjectESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdentifiedObject( IdentifiedObject newIdentifiedObject ) {
        if( newIdentifiedObject != identifiedObject ) {
            NotificationChain msgs = null;
            if( identifiedObject != null ) msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs );
            if( newIdentifiedObject != null ) msgs = ( ( InternalEObject ) newIdentifiedObject ).eInverseAdd( this,
                    CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs );
            msgs = basicSetIdentifiedObject( newIdentifiedObject, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIdentifiedObjectESet = identifiedObjectESet;
            identifiedObjectESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT,
                        newIdentifiedObject, newIdentifiedObject, !oldIdentifiedObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIdentifiedObject( NotificationChain msgs ) {
        IdentifiedObject oldIdentifiedObject = identifiedObject;
        identifiedObject = null;
        boolean oldIdentifiedObjectESet = identifiedObjectESet;
        identifiedObjectESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT, oldIdentifiedObject, null, oldIdentifiedObjectESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIdentifiedObject() {
        if( identifiedObject != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs );
            msgs = basicUnsetIdentifiedObject( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIdentifiedObjectESet = identifiedObjectESet;
            identifiedObjectESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT, null, null, oldIdentifiedObjectESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIdentifiedObject() {
        return identifiedObjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiagramObjectPoint > getDiagramObjectPoints() {
        if( diagramObjectPoints == null ) {
            diagramObjectPoints = new EObjectWithInverseResolvingEList.Unsettable< DiagramObjectPoint >(
                    DiagramObjectPoint.class, this, CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT );
        }
        return diagramObjectPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramObjectPoints() {
        if( diagramObjectPoints != null ) ( ( InternalEList.Unsettable< ? > ) diagramObjectPoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramObjectPoints() {
        return diagramObjectPoints != null && ( ( InternalEList.Unsettable< ? > ) diagramObjectPoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VisibilityLayer > getVisibilityLayers() {
        if( visibilityLayers == null ) {
            visibilityLayers = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< VisibilityLayer >(
                    VisibilityLayer.class, this, CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS,
                    CimPackage.VISIBILITY_LAYER__VISIBLE_OBJECTS );
        }
        return visibilityLayers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVisibilityLayers() {
        if( visibilityLayers != null ) ( ( InternalEList.Unsettable< ? > ) visibilityLayers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVisibilityLayers() {
        return visibilityLayers != null && ( ( InternalEList.Unsettable< ? > ) visibilityLayers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            if( diagram != null ) msgs = ( ( InternalEObject ) diagram ).eInverseRemove( this,
                    CimPackage.DIAGRAM__DIAGRAM_ELEMENTS, Diagram.class, msgs );
            return basicSetDiagram( ( Diagram ) otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            if( diagramObjectStyle != null ) msgs = ( ( InternalEObject ) diagramObjectStyle ).eInverseRemove( this,
                    CimPackage.DIAGRAM_OBJECT_STYLE__STYLED_OBJECTS, DiagramObjectStyle.class, msgs );
            return basicSetDiagramObjectStyle( ( DiagramObjectStyle ) otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            if( identifiedObject != null ) msgs = ( ( InternalEObject ) identifiedObject ).eInverseRemove( this,
                    CimPackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs );
            return basicSetIdentifiedObject( ( IdentifiedObject ) otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramObjectPoints() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVisibilityLayers() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            return basicUnsetDiagram( msgs );
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            return basicUnsetDiagramObjectStyle( msgs );
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            return basicUnsetIdentifiedObject( msgs );
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            return ( ( InternalEList< ? > ) getDiagramObjectPoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            return ( ( InternalEList< ? > ) getVisibilityLayers() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
            return getDrawingOrder();
        case CimPackage.DIAGRAM_OBJECT__IS_POLYGON:
            return getIsPolygon();
        case CimPackage.DIAGRAM_OBJECT__OFFSET_X:
            return getOffsetX();
        case CimPackage.DIAGRAM_OBJECT__OFFSET_Y:
            return getOffsetY();
        case CimPackage.DIAGRAM_OBJECT__ROTATION:
            return getRotation();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            return getDiagram();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            return getDiagramObjectStyle();
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            return getIdentifiedObject();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            return getDiagramObjectPoints();
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            return getVisibilityLayers();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
            setDrawingOrder( ( Integer ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__IS_POLYGON:
            setIsPolygon( ( Boolean ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__OFFSET_X:
            setOffsetX( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__OFFSET_Y:
            setOffsetY( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__ROTATION:
            setRotation( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            setDiagram( ( Diagram ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            setDiagramObjectStyle( ( DiagramObjectStyle ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            setIdentifiedObject( ( IdentifiedObject ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            getDiagramObjectPoints().clear();
            getDiagramObjectPoints().addAll( ( Collection< ? extends DiagramObjectPoint > ) newValue );
            return;
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            getVisibilityLayers().clear();
            getVisibilityLayers().addAll( ( Collection< ? extends VisibilityLayer > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
            unsetDrawingOrder();
            return;
        case CimPackage.DIAGRAM_OBJECT__IS_POLYGON:
            unsetIsPolygon();
            return;
        case CimPackage.DIAGRAM_OBJECT__OFFSET_X:
            unsetOffsetX();
            return;
        case CimPackage.DIAGRAM_OBJECT__OFFSET_Y:
            unsetOffsetY();
            return;
        case CimPackage.DIAGRAM_OBJECT__ROTATION:
            unsetRotation();
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            unsetDiagram();
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            unsetDiagramObjectStyle();
            return;
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            unsetIdentifiedObject();
            return;
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            unsetDiagramObjectPoints();
            return;
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            unsetVisibilityLayers();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
            return isSetDrawingOrder();
        case CimPackage.DIAGRAM_OBJECT__IS_POLYGON:
            return isSetIsPolygon();
        case CimPackage.DIAGRAM_OBJECT__OFFSET_X:
            return isSetOffsetX();
        case CimPackage.DIAGRAM_OBJECT__OFFSET_Y:
            return isSetOffsetY();
        case CimPackage.DIAGRAM_OBJECT__ROTATION:
            return isSetRotation();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM:
            return isSetDiagram();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
            return isSetDiagramObjectStyle();
        case CimPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
            return isSetIdentifiedObject();
        case CimPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
            return isSetDiagramObjectPoints();
        case CimPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
            return isSetVisibilityLayers();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (drawingOrder: " );
        if( drawingOrderESet )
            result.append( drawingOrder );
        else
            result.append( "<unset>" );
        result.append( ", isPolygon: " );
        if( isPolygonESet )
            result.append( isPolygon );
        else
            result.append( "<unset>" );
        result.append( ", offsetX: " );
        if( offsetXESet )
            result.append( offsetX );
        else
            result.append( "<unset>" );
        result.append( ", offsetY: " );
        if( offsetYESet )
            result.append( offsetY );
        else
            result.append( "<unset>" );
        result.append( ", rotation: " );
        if( rotationESet )
            result.append( rotation );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiagramObjectImpl
