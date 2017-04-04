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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectGluePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Object Glue Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiagramObjectGluePointImpl#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramObjectGluePointImpl extends CimObjectWithIDImpl implements DiagramObjectGluePoint {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramObjectGluePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiagramObjectGluePoint();
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
                    DiagramObjectPoint.class, this, CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS,
                    CimPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiagramObjectPoints() )
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
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            return ( ( InternalEList< ? > ) getDiagramObjectPoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            return getDiagramObjectPoints();
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
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            getDiagramObjectPoints().clear();
            getDiagramObjectPoints().addAll( ( Collection< ? extends DiagramObjectPoint > ) newValue );
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
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            unsetDiagramObjectPoints();
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
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
            return isSetDiagramObjectPoints();
        }
        return super.eIsSet( featureID );
    }

} //DiagramObjectGluePointImpl
