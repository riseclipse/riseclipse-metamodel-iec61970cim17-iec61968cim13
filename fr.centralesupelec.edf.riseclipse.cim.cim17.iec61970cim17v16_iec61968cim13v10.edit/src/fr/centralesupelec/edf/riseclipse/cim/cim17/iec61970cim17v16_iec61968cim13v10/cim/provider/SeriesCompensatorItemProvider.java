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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeriesCompensator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeriesCompensator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SeriesCompensatorItemProvider extends ConductingEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeriesCompensatorItemProvider( AdapterFactory adapterFactory ) {
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

            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addVaristorPresentPropertyDescriptor( object );
            addVaristorRatedCurrentPropertyDescriptor( object );
            addVaristorVoltageThresholdPropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SeriesCompensator_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SeriesCompensator_r_feature",
                                "_UI_SeriesCompensator_type" ),
                        CimPackage.eINSTANCE.getSeriesCompensator_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SeriesCompensator_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SeriesCompensator_r0_feature",
                                "_UI_SeriesCompensator_type" ),
                        CimPackage.eINSTANCE.getSeriesCompensator_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Varistor Present feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaristorPresentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SeriesCompensator_varistorPresent_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SeriesCompensator_varistorPresent_feature",
                        "_UI_SeriesCompensator_type" ),
                CimPackage.eINSTANCE.getSeriesCompensator_VaristorPresent(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Varistor Rated Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaristorRatedCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SeriesCompensator_varistorRatedCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SeriesCompensator_varistorRatedCurrent_feature", "_UI_SeriesCompensator_type" ),
                        CimPackage.eINSTANCE.getSeriesCompensator_VaristorRatedCurrent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Varistor Voltage Threshold feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaristorVoltageThresholdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SeriesCompensator_varistorVoltageThreshold_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SeriesCompensator_varistorVoltageThreshold_feature", "_UI_SeriesCompensator_type" ),
                CimPackage.eINSTANCE.getSeriesCompensator_VaristorVoltageThreshold(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SeriesCompensator_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SeriesCompensator_x_feature",
                                "_UI_SeriesCompensator_type" ),
                        CimPackage.eINSTANCE.getSeriesCompensator_X(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SeriesCompensator_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SeriesCompensator_x0_feature",
                                "_UI_SeriesCompensator_type" ),
                        CimPackage.eINSTANCE.getSeriesCompensator_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns SeriesCompensator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SeriesCompensator" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SeriesCompensator ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SeriesCompensator_type" )
                : getString( "_UI_SeriesCompensator_type" ) + " " + label;
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

        switch( notification.getFeatureID( SeriesCompensator.class ) ) {
        case CimPackage.SERIES_COMPENSATOR__R:
        case CimPackage.SERIES_COMPENSATOR__R0:
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_PRESENT:
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_RATED_CURRENT:
        case CimPackage.SERIES_COMPENSATOR__VARISTOR_VOLTAGE_THRESHOLD:
        case CimPackage.SERIES_COMPENSATOR__X:
        case CimPackage.SERIES_COMPENSATOR__X0:
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
