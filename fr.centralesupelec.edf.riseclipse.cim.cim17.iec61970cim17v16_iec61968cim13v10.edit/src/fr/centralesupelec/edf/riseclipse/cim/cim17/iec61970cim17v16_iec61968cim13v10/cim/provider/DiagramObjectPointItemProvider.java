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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObjectPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramObjectPointItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramObjectPointItemProvider( AdapterFactory adapterFactory ) {
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

            addSequenceNumberPropertyDescriptor( object );
            addXPositionPropertyDescriptor( object );
            addYPositionPropertyDescriptor( object );
            addZPositionPropertyDescriptor( object );
            addDiagramObjectPropertyDescriptor( object );
            addDiagramObjectGluePointPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Sequence Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSequenceNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DiagramObjectPoint_sequenceNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObjectPoint_sequenceNumber_feature",
                        "_UI_DiagramObjectPoint_type" ),
                CimPackage.eINSTANCE.getDiagramObjectPoint_SequenceNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the XPosition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPositionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObjectPoint_xPosition_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObjectPoint_xPosition_feature",
                                "_UI_DiagramObjectPoint_type" ),
                        CimPackage.eINSTANCE.getDiagramObjectPoint_XPosition(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the YPosition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYPositionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObjectPoint_yPosition_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObjectPoint_yPosition_feature",
                                "_UI_DiagramObjectPoint_type" ),
                        CimPackage.eINSTANCE.getDiagramObjectPoint_YPosition(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the ZPosition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZPositionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DiagramObjectPoint_zPosition_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObjectPoint_zPosition_feature",
                                "_UI_DiagramObjectPoint_type" ),
                        CimPackage.eINSTANCE.getDiagramObjectPoint_ZPosition(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Diagram Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramObjectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DiagramObjectPoint_DiagramObject_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_DiagramObjectPoint_DiagramObject_feature",
                        "_UI_DiagramObjectPoint_type" ),
                CimPackage.eINSTANCE.getDiagramObjectPoint_DiagramObject(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Diagram Object Glue Point feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiagramObjectGluePointPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DiagramObjectPoint_DiagramObjectGluePoint_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_DiagramObjectPoint_DiagramObjectGluePoint_feature", "_UI_DiagramObjectPoint_type" ),
                CimPackage.eINSTANCE.getDiagramObjectPoint_DiagramObjectGluePoint(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns DiagramObjectPoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DiagramObjectPoint" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DiagramObjectPoint ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_DiagramObjectPoint_type" )
                : getString( "_UI_DiagramObjectPoint_type" ) + " " + label;
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

        switch( notification.getFeatureID( DiagramObjectPoint.class ) ) {
        case CimPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
        case CimPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
        case CimPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
        case CimPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
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
