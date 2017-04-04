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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchingPlanItemProvider extends SwitchingStepGroupItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchingPlanItemProvider( AdapterFactory adapterFactory ) {
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

            addPurposePropertyDescriptor( object );
            addRankPropertyDescriptor( object );
            addOutagePropertyDescriptor( object );
            addSwitchingStepGroupsPropertyDescriptor( object );
            addWorkTasksPropertyDescriptor( object );
            addSafetyDocumentsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Purpose feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPurposePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingPlan_purpose_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_purpose_feature",
                                "_UI_SwitchingPlan_type" ),
                        CimPackage.eINSTANCE.getSwitchingPlan_Purpose(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rank feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRankPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingPlan_rank_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_rank_feature",
                                "_UI_SwitchingPlan_type" ),
                        CimPackage.eINSTANCE.getSwitchingPlan_Rank(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Outage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingPlan_Outage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_Outage_feature",
                                "_UI_SwitchingPlan_type" ),
                        CimPackage.eINSTANCE.getSwitchingPlan_Outage(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Step Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingStepGroupsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingPlan_SwitchingStepGroups_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_SwitchingStepGroups_feature",
                        "_UI_SwitchingPlan_type" ),
                CimPackage.eINSTANCE.getSwitchingPlan_SwitchingStepGroups(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingPlan_WorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_WorkTasks_feature",
                                "_UI_SwitchingPlan_type" ),
                        CimPackage.eINSTANCE.getSwitchingPlan_WorkTasks(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Safety Documents feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSafetyDocumentsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingPlan_SafetyDocuments_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingPlan_SafetyDocuments_feature",
                                "_UI_SwitchingPlan_type" ),
                        CimPackage.eINSTANCE.getSwitchingPlan_SafetyDocuments(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns SwitchingPlan.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SwitchingPlan" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SwitchingPlan ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SwitchingPlan_type" )
                : getString( "_UI_SwitchingPlan_type" ) + " " + label;
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

        switch( notification.getFeatureID( SwitchingPlan.class ) ) {
        case CimPackage.SWITCHING_PLAN__PURPOSE:
        case CimPackage.SWITCHING_PLAN__RANK:
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

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
