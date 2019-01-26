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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramStyle;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrientationKind;

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
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getX1InitialView <em>X1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getX2InitialView <em>X2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getY1InitialView <em>Y1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getY2InitialView <em>Y2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getDiagramElements <em>Diagram Elements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramImpl#getDiagramStyle <em>Diagram Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends IdentifiedObjectImpl implements Diagram {
    /**
     * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrientation()
     * @generated
     * @ordered
     */
    protected static final OrientationKind ORIENTATION_EDEFAULT = OrientationKind.POSITIVE;

    /**
     * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrientation()
     * @generated
     * @ordered
     */
    protected OrientationKind orientation = ORIENTATION_EDEFAULT;

    /**
     * This is true if the Orientation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean orientationESet;

    /**
     * The default value of the '{@link #getX1InitialView() <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1InitialView()
     * @generated
     * @ordered
     */
    protected static final Float X1_INITIAL_VIEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX1InitialView() <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX1InitialView()
     * @generated
     * @ordered
     */
    protected Float x1InitialView = X1_INITIAL_VIEW_EDEFAULT;

    /**
     * This is true if the X1 Initial View attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x1InitialViewESet;

    /**
     * The default value of the '{@link #getX2InitialView() <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2InitialView()
     * @generated
     * @ordered
     */
    protected static final Float X2_INITIAL_VIEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX2InitialView() <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2InitialView()
     * @generated
     * @ordered
     */
    protected Float x2InitialView = X2_INITIAL_VIEW_EDEFAULT;

    /**
     * This is true if the X2 Initial View attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x2InitialViewESet;

    /**
     * The default value of the '{@link #getY1InitialView() <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1InitialView()
     * @generated
     * @ordered
     */
    protected static final Float Y1_INITIAL_VIEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY1InitialView() <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1InitialView()
     * @generated
     * @ordered
     */
    protected Float y1InitialView = Y1_INITIAL_VIEW_EDEFAULT;

    /**
     * This is true if the Y1 Initial View attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y1InitialViewESet;

    /**
     * The default value of the '{@link #getY2InitialView() <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2InitialView()
     * @generated
     * @ordered
     */
    protected static final Float Y2_INITIAL_VIEW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY2InitialView() <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2InitialView()
     * @generated
     * @ordered
     */
    protected Float y2InitialView = Y2_INITIAL_VIEW_EDEFAULT;

    /**
     * This is true if the Y2 Initial View attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y2InitialViewESet;

    /**
     * The cached value of the '{@link #getDiagramElements() <em>Diagram Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramElements()
     * @generated
     * @ordered
     */
    protected EList< DiagramObject > diagramElements;

    /**
     * The cached value of the '{@link #getDiagramStyle() <em>Diagram Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramStyle()
     * @generated
     * @ordered
     */
    protected DiagramStyle diagramStyle;

    /**
     * This is true if the Diagram Style reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diagramStyleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiagram();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OrientationKind getOrientation() {
        return orientation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOrientation( OrientationKind newOrientation ) {
        OrientationKind oldOrientation = orientation;
        orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
        boolean oldOrientationESet = orientationESet;
        orientationESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM__ORIENTATION, oldOrientation, orientation, !oldOrientationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOrientation() {
        OrientationKind oldOrientation = orientation;
        boolean oldOrientationESet = orientationESet;
        orientation = ORIENTATION_EDEFAULT;
        orientationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DIAGRAM__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOrientation() {
        return orientationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX1InitialView() {
        return x1InitialView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX1InitialView( Float newX1InitialView ) {
        Float oldX1InitialView = x1InitialView;
        x1InitialView = newX1InitialView;
        boolean oldX1InitialViewESet = x1InitialViewESet;
        x1InitialViewESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM__X1_INITIAL_VIEW, oldX1InitialView, x1InitialView, !oldX1InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX1InitialView() {
        Float oldX1InitialView = x1InitialView;
        boolean oldX1InitialViewESet = x1InitialViewESet;
        x1InitialView = X1_INITIAL_VIEW_EDEFAULT;
        x1InitialViewESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM__X1_INITIAL_VIEW,
                    oldX1InitialView, X1_INITIAL_VIEW_EDEFAULT, oldX1InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX1InitialView() {
        return x1InitialViewESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX2InitialView() {
        return x2InitialView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX2InitialView( Float newX2InitialView ) {
        Float oldX2InitialView = x2InitialView;
        x2InitialView = newX2InitialView;
        boolean oldX2InitialViewESet = x2InitialViewESet;
        x2InitialViewESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM__X2_INITIAL_VIEW, oldX2InitialView, x2InitialView, !oldX2InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX2InitialView() {
        Float oldX2InitialView = x2InitialView;
        boolean oldX2InitialViewESet = x2InitialViewESet;
        x2InitialView = X2_INITIAL_VIEW_EDEFAULT;
        x2InitialViewESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM__X2_INITIAL_VIEW,
                    oldX2InitialView, X2_INITIAL_VIEW_EDEFAULT, oldX2InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX2InitialView() {
        return x2InitialViewESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY1InitialView() {
        return y1InitialView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY1InitialView( Float newY1InitialView ) {
        Float oldY1InitialView = y1InitialView;
        y1InitialView = newY1InitialView;
        boolean oldY1InitialViewESet = y1InitialViewESet;
        y1InitialViewESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM__Y1_INITIAL_VIEW, oldY1InitialView, y1InitialView, !oldY1InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY1InitialView() {
        Float oldY1InitialView = y1InitialView;
        boolean oldY1InitialViewESet = y1InitialViewESet;
        y1InitialView = Y1_INITIAL_VIEW_EDEFAULT;
        y1InitialViewESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM__Y1_INITIAL_VIEW,
                    oldY1InitialView, Y1_INITIAL_VIEW_EDEFAULT, oldY1InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY1InitialView() {
        return y1InitialViewESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY2InitialView() {
        return y2InitialView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY2InitialView( Float newY2InitialView ) {
        Float oldY2InitialView = y2InitialView;
        y2InitialView = newY2InitialView;
        boolean oldY2InitialViewESet = y2InitialViewESet;
        y2InitialViewESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DIAGRAM__Y2_INITIAL_VIEW, oldY2InitialView, y2InitialView, !oldY2InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY2InitialView() {
        Float oldY2InitialView = y2InitialView;
        boolean oldY2InitialViewESet = y2InitialViewESet;
        y2InitialView = Y2_INITIAL_VIEW_EDEFAULT;
        y2InitialViewESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DIAGRAM__Y2_INITIAL_VIEW,
                    oldY2InitialView, Y2_INITIAL_VIEW_EDEFAULT, oldY2InitialViewESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY2InitialView() {
        return y2InitialViewESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiagramObject > getDiagramElements() {
        if( diagramElements == null ) {
            diagramElements = new EObjectWithInverseResolvingEList.Unsettable< DiagramObject >( DiagramObject.class,
                    this, CimPackage.DIAGRAM__DIAGRAM_ELEMENTS, CimPackage.DIAGRAM_OBJECT__DIAGRAM );
        }
        return diagramElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiagramElements() {
        if( diagramElements != null ) ( ( InternalEList.Unsettable< ? > ) diagramElements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramElements() {
        return diagramElements != null && ( ( InternalEList.Unsettable< ? > ) diagramElements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagramStyle getDiagramStyle() {
        return diagramStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagramStyle( DiagramStyle newDiagramStyle, NotificationChain msgs ) {
        DiagramStyle oldDiagramStyle = diagramStyle;
        diagramStyle = newDiagramStyle;
        boolean oldDiagramStyleESet = diagramStyleESet;
        diagramStyleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM__DIAGRAM_STYLE, oldDiagramStyle, newDiagramStyle, !oldDiagramStyleESet );
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
    public void setDiagramStyle( DiagramStyle newDiagramStyle ) {
        if( newDiagramStyle != diagramStyle ) {
            NotificationChain msgs = null;
            if( diagramStyle != null ) msgs = ( ( InternalEObject ) diagramStyle ).eInverseRemove( this,
                    CimPackage.DIAGRAM_STYLE__DIAGRAM, DiagramStyle.class, msgs );
            if( newDiagramStyle != null ) msgs = ( ( InternalEObject ) newDiagramStyle ).eInverseAdd( this,
                    CimPackage.DIAGRAM_STYLE__DIAGRAM, DiagramStyle.class, msgs );
            msgs = basicSetDiagramStyle( newDiagramStyle, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramStyleESet = diagramStyleESet;
            diagramStyleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DIAGRAM__DIAGRAM_STYLE, newDiagramStyle, newDiagramStyle, !oldDiagramStyleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiagramStyle( NotificationChain msgs ) {
        DiagramStyle oldDiagramStyle = diagramStyle;
        diagramStyle = null;
        boolean oldDiagramStyleESet = diagramStyleESet;
        diagramStyleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM__DIAGRAM_STYLE, oldDiagramStyle, null, oldDiagramStyleESet );
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
    public void unsetDiagramStyle() {
        if( diagramStyle != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) diagramStyle ).eInverseRemove( this, CimPackage.DIAGRAM_STYLE__DIAGRAM,
                    DiagramStyle.class, msgs );
            msgs = basicUnsetDiagramStyle( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiagramStyleESet = diagramStyleESet;
            diagramStyleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DIAGRAM__DIAGRAM_STYLE, null, null, oldDiagramStyleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiagramStyle() {
        return diagramStyleESet;
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
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramElements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            if( diagramStyle != null ) msgs = ( ( InternalEObject ) diagramStyle ).eInverseRemove( this,
                    CimPackage.DIAGRAM_STYLE__DIAGRAM, DiagramStyle.class, msgs );
            return basicSetDiagramStyle( ( DiagramStyle ) otherEnd, msgs );
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
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            return ( ( InternalEList< ? > ) getDiagramElements() ).basicRemove( otherEnd, msgs );
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            return basicUnsetDiagramStyle( msgs );
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
        case CimPackage.DIAGRAM__ORIENTATION:
            return getOrientation();
        case CimPackage.DIAGRAM__X1_INITIAL_VIEW:
            return getX1InitialView();
        case CimPackage.DIAGRAM__X2_INITIAL_VIEW:
            return getX2InitialView();
        case CimPackage.DIAGRAM__Y1_INITIAL_VIEW:
            return getY1InitialView();
        case CimPackage.DIAGRAM__Y2_INITIAL_VIEW:
            return getY2InitialView();
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            return getDiagramElements();
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            return getDiagramStyle();
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
        case CimPackage.DIAGRAM__ORIENTATION:
            setOrientation( ( OrientationKind ) newValue );
            return;
        case CimPackage.DIAGRAM__X1_INITIAL_VIEW:
            setX1InitialView( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM__X2_INITIAL_VIEW:
            setX2InitialView( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM__Y1_INITIAL_VIEW:
            setY1InitialView( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM__Y2_INITIAL_VIEW:
            setY2InitialView( ( Float ) newValue );
            return;
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            getDiagramElements().clear();
            getDiagramElements().addAll( ( Collection< ? extends DiagramObject > ) newValue );
            return;
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            setDiagramStyle( ( DiagramStyle ) newValue );
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
        case CimPackage.DIAGRAM__ORIENTATION:
            unsetOrientation();
            return;
        case CimPackage.DIAGRAM__X1_INITIAL_VIEW:
            unsetX1InitialView();
            return;
        case CimPackage.DIAGRAM__X2_INITIAL_VIEW:
            unsetX2InitialView();
            return;
        case CimPackage.DIAGRAM__Y1_INITIAL_VIEW:
            unsetY1InitialView();
            return;
        case CimPackage.DIAGRAM__Y2_INITIAL_VIEW:
            unsetY2InitialView();
            return;
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            unsetDiagramElements();
            return;
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            unsetDiagramStyle();
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
        case CimPackage.DIAGRAM__ORIENTATION:
            return isSetOrientation();
        case CimPackage.DIAGRAM__X1_INITIAL_VIEW:
            return isSetX1InitialView();
        case CimPackage.DIAGRAM__X2_INITIAL_VIEW:
            return isSetX2InitialView();
        case CimPackage.DIAGRAM__Y1_INITIAL_VIEW:
            return isSetY1InitialView();
        case CimPackage.DIAGRAM__Y2_INITIAL_VIEW:
            return isSetY2InitialView();
        case CimPackage.DIAGRAM__DIAGRAM_ELEMENTS:
            return isSetDiagramElements();
        case CimPackage.DIAGRAM__DIAGRAM_STYLE:
            return isSetDiagramStyle();
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
        result.append( " (orientation: " );
        if( orientationESet )
            result.append( orientation );
        else
            result.append( "<unset>" );
        result.append( ", x1InitialView: " );
        if( x1InitialViewESet )
            result.append( x1InitialView );
        else
            result.append( "<unset>" );
        result.append( ", x2InitialView: " );
        if( x2InitialViewESet )
            result.append( x2InitialView );
        else
            result.append( "<unset>" );
        result.append( ", y1InitialView: " );
        if( y1InitialViewESet )
            result.append( y1InitialView );
        else
            result.append( "<unset>" );
        result.append( ", y2InitialView: " );
        if( y2InitialViewESet )
            result.append( y2InitialView );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiagramImpl
