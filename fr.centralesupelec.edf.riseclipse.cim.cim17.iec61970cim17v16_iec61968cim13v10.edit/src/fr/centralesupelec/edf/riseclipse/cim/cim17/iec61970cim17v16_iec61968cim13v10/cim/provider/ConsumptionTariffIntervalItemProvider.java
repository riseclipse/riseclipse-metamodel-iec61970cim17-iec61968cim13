/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsumptionTariffIntervalItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConsumptionTariffIntervalItemProvider( AdapterFactory adapterFactory ) {
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
            addStartValuePropertyDescriptor( object );
            addTariffProfilesPropertyDescriptor( object );
            addChargesPropertyDescriptor( object );
            addTouTariffIntervalsPropertyDescriptor( object );
            addReadingTypePropertyDescriptor( object );
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
                getString( "_UI_ConsumptionTariffInterval_sequenceNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConsumptionTariffInterval_sequenceNumber_feature",
                        "_UI_ConsumptionTariffInterval_type" ),
                CimPackage.eINSTANCE.getConsumptionTariffInterval_SequenceNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Start Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConsumptionTariffInterval_startValue_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConsumptionTariffInterval_startValue_feature",
                        "_UI_ConsumptionTariffInterval_type" ),
                CimPackage.eINSTANCE.getConsumptionTariffInterval_StartValue(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tariff Profiles feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTariffProfilesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConsumptionTariffInterval_TariffProfiles_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConsumptionTariffInterval_TariffProfiles_feature",
                        "_UI_ConsumptionTariffInterval_type" ),
                CimPackage.eINSTANCE.getConsumptionTariffInterval_TariffProfiles(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Charges feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChargesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConsumptionTariffInterval_Charges_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConsumptionTariffInterval_Charges_feature",
                        "_UI_ConsumptionTariffInterval_type" ),
                CimPackage.eINSTANCE.getConsumptionTariffInterval_Charges(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tou Tariff Intervals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTouTariffIntervalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConsumptionTariffInterval_TouTariffIntervals_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConsumptionTariffInterval_TouTariffIntervals_feature",
                                "_UI_ConsumptionTariffInterval_type" ),
                        CimPackage.eINSTANCE.getConsumptionTariffInterval_TouTariffIntervals(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Reading Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadingTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConsumptionTariffInterval_ReadingType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConsumptionTariffInterval_ReadingType_feature",
                        "_UI_ConsumptionTariffInterval_type" ),
                CimPackage.eINSTANCE.getConsumptionTariffInterval_ReadingType(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns ConsumptionTariffInterval.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ConsumptionTariffInterval" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ConsumptionTariffInterval ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_ConsumptionTariffInterval_type" )
                : getString( "_UI_ConsumptionTariffInterval_type" ) + " " + label;
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

        switch( notification.getFeatureID( ConsumptionTariffInterval.class ) ) {
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER:
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL__START_VALUE:
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
