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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramObjectItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramObjectItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addDrawingOrderPropertyDescriptor( object );
            addIsPolygonPropertyDescriptor( object );
            addOffsetXPropertyDescriptor( object );
            addOffsetYPropertyDescriptor( object );
            addRotationPropertyDescriptor( object );
            addDiagramPropertyDescriptor( object );
            addDiagramObjectStylePropertyDescriptor( object );
            addIdentifiedObjectPropertyDescriptor( object );
            addDiagramObjectPointsPropertyDescriptor( object );
            addVisibilityLayersPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Drawing Order feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDrawingOrderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_drawingOrder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_drawingOrder_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_DrawingOrder(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Polygon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPolygonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_isPolygon_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_isPolygon_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_IsPolygon(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Offset X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOffsetXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_offsetX_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_offsetX_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_OffsetX(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Offset Y feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOffsetYPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_offsetY_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_offsetY_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_OffsetY(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rotation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRotationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_rotation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_rotation_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_Rotation(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Diagram feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_Diagram_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_Diagram_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_Diagram(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Diagram Object Style feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramObjectStylePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_DiagramObjectStyle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_DiagramObjectStyle_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_DiagramObjectStyle(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Identified Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdentifiedObjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_IdentifiedObject_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_IdentifiedObject_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_IdentifiedObject(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Diagram Object Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramObjectPointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DiagramObject_DiagramObjectPoints_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_DiagramObjectPoints_feature",
                        "_UI_DiagramObject_type" ),
                CimPackage.eINSTANCE.getDiagramObject_DiagramObjectPoints(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Visibility Layers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVisibilityLayersPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObject_VisibilityLayers_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObject_VisibilityLayers_feature",
                                "_UI_DiagramObject_type" ),
                        CimPackage.eINSTANCE.getDiagramObject_VisibilityLayers(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns DiagramObject.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DiagramObject" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DiagramObject ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_DiagramObject_type" )
                : getString( "_UI_DiagramObject_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( DiagramObject.class ) ) {
        case CimPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
        case CimPackage.DIAGRAM_OBJECT__IS_POLYGON:
        case CimPackage.DIAGRAM_OBJECT__OFFSET_X:
        case CimPackage.DIAGRAM_OBJECT__OFFSET_Y:
        case CimPackage.DIAGRAM_OBJECT__ROTATION:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
